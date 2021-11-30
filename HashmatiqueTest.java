import java.util.HashMap;

public class HashmatiqueTest{

    public static void main(String[] args){


        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("More Than A Feeling", "fsdakfljsdf afsdkfjs fsdk;ljfa s;kfljaf skdfjs d;lfjkas d;fjsa df");
        tracklist.put("Dust In the Bottle", "fsdakfljsdf afsdkfjs fsdk;ljfa s;kfljaf skdfjs d;lfjkas d;fjsa df");
        tracklist.put("Freebird", "fsdakfljsdf afsdkfjs fsdk;ljfa s;kfljaf skdfjs d;lfjkas d;fjsa df");
        tracklist.put("Dark Stallion", "fsdakfljsdf afsdkfjs fsdk;ljfa s;kfljaf skdfjs d;lfjkas d;fjsa df");

        System.out.println(tracklist.get("More Than A Feeling"));
    }
}