public class SimpleCreationExamples {

    static ArrayList<Integer> returnList = new ArrayList<>();
    static Integer [] arrays = new Integer [] {1,2,3,4};

    public static void main(String [] args) {
        Observable<Integer> observable = null;
        System.out.println("-------------------------------------------");
        System.out.println("Observable creation from a single value");
        System.out.println("-------------------------------------------");
        observable = Observable.from(new Integer[]{Integer.valueOf(42)});
        observable.subscribe((i) -> {
            System.out.println(i);
        });

        System.out.println("-------------------------------------------");
        System.out.println("Observable creation from an Iterable");
        System.out.println("-------------------------------------------");
        observable = Observable.from(addtoList(returnList));
        observable.subscribe((i) -> {
            System.out.println(i);
        });

        System.out.println("-------------------------------------------");
        System.out.println("Observable creation from an Array");
        System.out.println("-------------------------------------------");
        observable = Observable.from(arrays);
        observable.subscribe((i) -> {
            System.out.println(i);
        });


    }

    private static List<Integer> addtoList(List<Integer> returnList) {
        returnList.add(1);
        returnList.add(10);
        returnList.add(20);
        returnList.add(30);
        returnList.add(40);
        returnList.add(50);
        returnList.add(60);
        return returnList;
    }
}