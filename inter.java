import java.util.*;

class Student
{
    String name;
    double cg;
    int token;
    Student(String name,double cg,int token)
    {
        this.name = name;
        this.cg = cg;
        this.token = token;
    }
    public String toString()
    {
    //    System.out.println(name);
    return name;
    }
    
}


class Sort implements Comparator<Student>
{
    
    public int compare(Student a ,Student b)
    {
        if(a.cg!=b.cg)
        {
            if(b.cg>a.cg)
            return 1;
            else
            return -1;
        }
        
        if(a.name.compareTo(b.name)!=0)
        return a.name.compareTo(b.name);
        
        
        return a.token - b.token;
    }
}
public class Execute
{
    public static void main(String[] args)
    {
        TreeSet<Student> tr = new TreeSet<Student>(new Sort());
        
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        while(n!=0)
        {
            String s = sc.next();
            if(s.compareTo("ENTER")==0)
            {
                String name = sc.next();
                double cg = sc.nextDouble();
                int token = sc.nextInt();
                tr.add(new Student(name,cg,token));
                //System.out.println(name + "pppp");
            }
            if(s.compareTo("SERVED")==0)
            {
                Student stu = tr.pollFirst();
                //System.out.println(stu.name);
            }
            n--;
        }
        Iterator value = tr.iterator(); 
  
                while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 
    }
}


