package com.mphasis.InheritanceSports;

public class App 
{
	public abstract class Sports{
		public abstract String play();
	}
	public class Football extends Sports{
		String name;
		public Football(String name) {
			this.name=name;
		}
		public String play() {
			return "Messi plays "+name;
		}
	}
	public class Cricket extends Sports{
		String name;
		public Cricket(String name) {
			this.name=name;
		}
		public String play() {
			return "Dhoni plays "+name;
		}
	}
	public class Basketball extends Sports{
		String name;
		public Basketball(String name) {
			this.name=name;
		}
		public String play() {
			return "Kobe plays "+name;
		}
	}
    public static void main( String[] args )
    {
        App app=new App();
        Sports football=app.new Football("Football");
        Sports cricket=app.new Cricket("Cricket");
        Sports basketball=app.new Basketball("basketball");
        System.out.println(football.play());
        System.out.println(cricket.play());
        System.out.println(basketball.play());
    }
}
