package Section5;

public class PaintJob {

    public static int getBucketCounts(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double areaToPaint = width * height;
        double result = areaToPaint / areaPerBucket;
        int bucetToBuy = (int) (Math.ceil(result) - extraBuckets);
        return bucetToBuy;
    }

    public static int getBucketCounts(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double areaToPaint = width * height;
        double result = areaToPaint / areaPerBucket;
        int bucetToBuy = (int) (Math.ceil(result));
        return bucetToBuy;
    }


    public static int getBucketCounts(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double result = area / areaPerBucket;
        int bucetToBuy = (int) (Math.ceil(result));
        return bucetToBuy;
    }

    public static void main(String[] args) {
        getBucketCounts(3.4, 2.1, 1.5, 2);
    }
}
