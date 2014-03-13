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
import java.io.*;

public class Exercici6 {
	
		public static void main(String[] args) {
			BufferedReader Buff;
			File file1 = new File ("/home/ernest/dsa.jpeg");
			File file2 = new File ("/home/ernest/workspace-dsa/essencials1-7/src/essencials/prova.txt");
			String total;
			try{
				int file1Count = (int) file1.length();
				Buff = new BufferedReader(new FileReader(file2));
				int file2Count = 0;
				while (Buff.ready()) {
					total = Buff.readLine();
					file2Count = file2Count + total.length();
				}
				Buff.close();
				
				if(file1Count > file2Count){
					System.out.println("L'arxiu JPEG conté més bytes que caracters el .txt  RESULTAT:  "+ file1Count +" > "+ file2Count);
				}
				else if( file1Count == file2Count){
					System.out.println("Tenen el mateix tamany  RESULTAT:  "+ file2Count +" = "+ file1Count);

				}
				else{
					System.out.println("L'arxiu .txt conté més caracters que bytes el .txt RESULTAT:  "+ file2Count +" > "+ file1Count);

				}
				
			}catch (FileNotFoundException e) {
				System.err.println("FileNotFoundException: " + e.getMessage());
			} catch (IOException e) {
				System.err.println("Exception: " + e.getMessage());
			}
		}
	}

