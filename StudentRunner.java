public class StudentRunner {


    public static void main(String []args){
        int [] marks= {100,99,89};

        Student student = new Student("Ranga",marks);
        int number = student.getNumberOfMarks();
        System.out.println("number of subject :"+number);
        int sum = student.getTotalSumOfMark();
        System.out.println("total makrs : "+sum);

    }
}
