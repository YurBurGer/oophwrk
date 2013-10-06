package t3;

import java.util.LinkedList;

public class Parse {
	private static LinkedList<String> toPolish(String s){
		char[] chstr=s.toCharArray();
		LinkedList<String> str=new LinkedList<>(); 
		LinkedList<String> stack=new LinkedList<>();
		int maxprior=0;
		LinkedList<String> out=new LinkedList<>();
		String a="";
		for(int i=0;i<chstr.length;i++){			
			if(((chstr[i]>='a')&&(chstr[i]<='z'))||((chstr[i]>='A')&&(chstr[i]<='Z'))||((chstr[i]>='0')&&(chstr[i]<='9'))){
				a=a.concat(Character.toString(chstr[i]));
			}
			else{
				str.addLast(Character.toString(chstr[i]));
				if(a.compareTo("")!=0){
					str.addLast(a);
					a="";
				}
			}
		}
		for(String token:str){
			char c=token.charAt(0);
			int p=priority(c);
			if(p>1){
				if(stack.isEmpty()||p>maxprior){
					out.addLast(token);
					maxprior=p;
				}
				else{
					while(priority(stack.peek().charAt(0))>=p){
						out.addLast(stack.poll());
					}
					stack.push(token);
					for(String str1:stack){
						maxprior=Math.max(maxprior, priority(str1.charAt(0)));
					}					
				}				
			}
			else if(p>0){
				stack.push(token);
			}
			else if(p<0){
				while(stack.peek().charAt(0)!='('){
					out.addLast(stack.poll());
				}
				stack.poll();
			}
			else{
				out.addLast(token);
			}
		}
		while(!stack.isEmpty()){
			out.addLast(stack.poll());
		}
		return out;
	}
	private static int priority(char c){
		switch(c){
		case '*':
			return 3;
		case '/':
			return 3;
		case '+':
			return 2;
		case '-':
			return 2;
		case '(':
			return 1;
		case ')':
			return -1;
		default:
			return 0;
		}
	}
	public static void main(String[] args){
		System.out.println(toPolish("(x+1222)*x").toString());
	}
}
