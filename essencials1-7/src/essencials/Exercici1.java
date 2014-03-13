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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("/home/ernest/workspace-dsa/essencials1-7/src/essencials/numeros.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				
				int s = sc.nextInt();
				
				System.out.println(s);
			}
			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
	}
}
