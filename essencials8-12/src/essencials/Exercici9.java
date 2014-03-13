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

public class Exercici9 {
	public static void main( String[] args )
    {
		CompteEnrera2 cont1 = new CompteEnrera2("ID1", 4);
		CompteEnrera2 cont2 = new CompteEnrera2("ID2", 7);
		CompteEnrera2 cont3 = new CompteEnrera2("ID3", 8);
    	
    	cont1.start();
    	cont2.start();
    	cont3.start();
    }
}
