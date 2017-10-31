/*
 * Created by SharpDevelop.
 * User: Viro
 * Date: 30.10.2017
 * Time: 21:07
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace TheWorld.entity
{
	/// <summary>
	/// Description of Dog.
	/// </summary>
	public class Dog : Animal
	{
		
		private string sex;
		
		public Dog()
		{			
		}
		
		public void setSex(string sex) {
			this.sex = sex;
		}
		
		public string getSex() {
			return sex;
		}
		
	}
}
