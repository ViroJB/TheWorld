/*
 * Created by SharpDevelop.
 * User: Viro
 * Date: 30.10.2017
 * Time: 20:54
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Threading;
using TheWorld.entity;

namespace TheWorld
{
	class Program
	{
		
		const int ticks = 4;
		const int delay = 500;
		
		public static void Main(string[] args)
		{
			// TODO arraylist von animals die arraylisten der einzelnen tiere enthält
			
			Random r = new Random();
			var animals = new ArrayList();
			var dogs = new List<Dog>();
			
			animals.Add(dogs);
			
			int i = 0;
			while(true) {
				animals.Add(new Dog());
				animals.Item
				dog.setId(i);
				dog.setAge(r.Next(0,5));
				dog.setMaxAge(r.Next(12,30));
				if(r.Next(0,2) == 1) {
					dogs[i].setSex("m");
				} else {
					dogs[i].setSex("w");
				}
				
				if(i % ticks == 0) {
					
				}
				
				Console.Write(dogs[i].getId() + ". " + dogs[i].getSex() + " " + dogs[i].getAge() + " " + dogs[i].getMaxAge() + "\n");
				++i;
				Thread.Sleep(delay);
			}
		}
	}
}