package Students;

public class Student {
	private String surname, name;
	private int fiz, mat, prog;
	
	//Метод студент
	public Student(String name, String surname) 
	{
		this.name = name;
	    this.surname = surname;
	    mat = fiz = prog = -1;
	}
	
	//Метод сдал математика
	public void PassMat (int mat)
	{
		if (mat > 2 && mat <= 5)
		{
            this.mat = mat;
			System.out.println("Студент " + name + " сдал математику");
		}
		else
			if (mat == 2) 
			{
				this.mat = mat;
				System.out.println("Студент " + name + " не сдал математику");
			}
	}
	
	//Метод сдал физику
	public void PassFiz (int fiz)
	{
		if (fiz > 2 && fiz <= 5)
		{
            this.fiz = fiz;
			System.out.println("Студент " + name + " сдал физику");
		}
		else
			if (fiz == 2) 
			{
				this.fiz = fiz;
				System.out.println("Студент " + name + " не сдал физику");
			}
	}
	
	//Метод сдал программирование
	public void PassProg (int prog)
	{
		if (prog > 2 && prog <= 5)
		{
            this.prog = prog;
			System.out.println("Студент " + name + " сдал программирование");
		}
		else
			if (prog == 2) 
			{
				this.prog = prog;
				System.out.println("Студент " + name + " не сдал программирование");
			}
	}
	
	//Метод плохой студент
	public boolean BadStud() {
	       return (fiz <= 3) || (mat <= 3) || (prog <= 3);
	    }
	
	//Метод средняя оценка
	public double Srednee ()
	{
		return 1.0*(mat+fiz+prog)/3;
	}
	
	
@Override
	public String toString()
	{
		return String.format("%-20s M(%d) Ф(%d) П(%d) Ср.(%.1f)", name + " " + surname, mat, fiz, prog, this.Srednee());
	}
    
public int compareTo(Object obj)
    {
      Student stud = (Student)obj;
      if(this.Srednee() < stud.Srednee())
      {
        /* Текущий класс меньше (ср. оценка меньше) */
        return -1;
      }   
      else if(this.Srednee() > stud.Srednee())
      {
          /* Текущий класс больше (ср. оценка меньше) */
        return 1;
      }
      /* средние оценки равны */
      return 0;  
    }
		
	}

//Даниил Доценко М(5) Ф(4) П(5)
//Иван Иванов М(2) Ф(4) П(3)