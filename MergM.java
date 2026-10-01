public class MergM{
    int size;
    String fileName;

    public void together(int a, String b){
        this.size=a;
        this.fileName=b;
    }
    public void display(){
        System.out.println("Size: " + size);
        System.out.println("File Name: " + fileName);
    }
}