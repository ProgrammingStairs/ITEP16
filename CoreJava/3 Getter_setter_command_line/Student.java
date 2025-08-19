class Student{
    // data members
    private int rno;
    private String name;
    private double per;

    // member functions
    // setter method
    public void setRno(int rno){
        this.rno=rno;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPer(double per){
        this.per=per;
    }

    // getter method
    public int getRno(){
        return rno;
    }
    public String getName(){
        return name;
    }
    public double getPer(){
        return per;
    }
}