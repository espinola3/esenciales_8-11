/*
 * Copyright 2014 Ernest Espinola Torrent
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package essencials;

public class CompteEnrera3 extends Thread{
	
		
		int conteo;
		public String Nom;
		public Thread th;
		public CompteEnrera3 (String ID, int cuenta){
			super(ID);
			conteo = cuenta;
			Nom = ID;
			th = new Thread(this,ID);
			th.start();

		}
		public void run(){
			try{
				for(int i = conteo; i>= 0; i--){
				Thread.sleep(998);
				System.out.println(i + " " + Nom + " ultima escritura " + Exercici10.ultimaEscriptura);
				if(i == 0){
					System.out.println("Ultima escriptura " + Nom + " - " + Thread.activeCount() + " Threads actius");
				}
				
				Exercici10.ultimaEscriptura = Nom;
				}
			} catch (InterruptedException e) {
				System.err.println("InterruptedException: " + e);
			}
				
			
			
				
			
		}
}
