class ComplexNumber {
    public static void main(String[] args){
        Complex C = new Complex(4,5);
        Complex D = new Complex(7,8);
        Complex e = Complex.add(C,D);
        Complex f = Complex.sub(C,D);
        Complex g = Complex.mul(C,D);
        e.printcomplex();
        f.printcomplex();
        g.printcomplex();

    }
}
class Complex{
    int real ;
    int img;
    public Complex(int r, int i){
        real = r;
        img = i;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.img +b.img));
    }
    public static Complex sub(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.img -b.img));
    }
    public static Complex mul(Complex a, Complex b){
        int realPart = a.real * b.real - a.img * b.img;
        int imgPart = a.real * b.img + a.img * b.real;
        return new Complex(realPart, imgPart);
    }
    

    public void printcomplex(){
        if(real == 0 && img != 0){
            System.out.println(img +"i");
        }
        else if(img == 0 && real !=0){
            System.out.println(real);
        }
        else{
            System.out.println(real + "+"+img+"i");
        }
    }
}