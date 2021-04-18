package labmodule3;

import java.util.Scanner;

public class CcnsoWithNextAlphabet {
	private static String toConvert(char[] str)
	{
		for(int i=0;i<str.length;i++)
		{
		   if(!(str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U'))
		   {
				if(str[i]=='Z')
				{
					 str[i]='B';
				}
			    else
				{
				      str[i] = (char) (str[i]+1);
				      if(str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
				      {
					       str[i]=(char) (str[i]+1);
				      }
				}
			}
		}
		return String.valueOf(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab =new Scanner(System.in);
		String str=ab.next();
		str=str.toUpperCase();
		System.out.println(toConvert(str.toCharArray()));
      }
 }
