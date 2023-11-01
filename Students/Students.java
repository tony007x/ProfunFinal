package Students;

public class Students {
    String name;
    String address;
    static int [] grade = new int[30];

    Students(String n , String add){
        name = n;
        address = add;
    }

    
    public static double getAvgGrade(){

        double sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum+=grade[i];
        }

        return sum/=grade.length;
    }

    @Override
    public String toString(){
        return name+" "+address+"";
    }

    public static void main(String[] args) {

        Students s = new Students( "Gun", "788");
        Students.getAvgGrade();
        for (int i = 0; i < grade.length; i++) {
            if(i%2==0){
                grade[i]=3;
            }
            else{
                grade[i]=2;
            }
        }
        System.out.print(s+" ");
        System.out.println(Students.getAvgGrade());

        
        
    }

}
