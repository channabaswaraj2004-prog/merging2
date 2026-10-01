public class Merg{
    int size;
    String fileName;

    public void together(int a, String b){
        this.size=a;
        this.fileName=b;
    }
    public void display(){
        Merg m = new Merg();
        m.together(23, "Merging");
        System.out.println("Size: " + m.size);
        System.out.println("File Name: " + m.fileName);
    }
}