package Chapter_4.Quiz_4;

public class Average {
    private int nextIndex;
    private int[] array = new int[10];
    private int hap;


    Average() {
        this.nextIndex = -1;
        this.hap = 0;
    }

        void put(int x){
            this.nextIndex++;
            array[this.nextIndex] = x;
            this.hap += x;
        }

        void showAll() {
            for (int i = 0; i <= this.nextIndex; i++) {
                System.out.println(array[i]);
            }
        }

        double getAvg(){
        ++this.nextIndex;
        return (double)this.hap/(double)this.nextIndex;
        }
}
