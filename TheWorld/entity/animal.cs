/*
 * Created by SharpDevelop.
 * User: Viro
 * Date: 30.10.2017
 * Time: 20:58
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace TheWorld.entity
{
	/// <summary>
	/// Description of animal.
	/// </summary>
	public class Animal
	{
		
		private int id;
		private int age = 0;
		private int maxAge = 0;
		
		public Animal()
		{
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public int getId() {
			return this.id;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getAge() {
			return this.age;
		}
		
		public void setMaxAge(int maxAge) {
			this.maxAge = maxAge;
		}
		
		public int getMaxAge() {
			return this.maxAge;
		}
	}
}
