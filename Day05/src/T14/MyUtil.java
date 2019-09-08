package T14;

public class MyUtil<E> {
    private E data;

    public void add(E data){
        this.data = data;
    }

    public E getData(){
        return this.data;
    }

}
