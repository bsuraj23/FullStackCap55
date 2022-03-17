public class sample {
    int a;
    sample(){
        System.out.println("Non-Parametric");
    }
    sample(int w, int q){
        System.out.println("Parametric");
    }
    sample(sample s){
        System.out.println("sample s as a parameter");
    }
}
