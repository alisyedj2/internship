public class Shuffle{
    public static void main(String[] args) {
        Shuffle m = new Shuffle();
        int a[] = {1,2,3,4,5,6,7};
        m.shuffle(a);
        for(int i: a) System.out.println(i);
    }
    private void shuffle(int[] a){
        for(int i=0;i<7;i++){
            int index = (int) (Math.random()*7);
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }
}