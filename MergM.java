public class MergM{
    int size;
    String fileName;

    public void together(int a, String b){
        this.size=a;
        this.fileName=b;
    }
    public void display(){
        MergM m = new MergM();
        m.together(23, "Merging");
        System.out.println("Size: " + m.size);
        System.out.println("File Name: " + m.fileName);
    }
}