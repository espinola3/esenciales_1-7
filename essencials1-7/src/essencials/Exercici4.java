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

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.*;

public class Exercici4 {
	public static void main(String[] args) {
		File f = new File(
				"/home/ernest/workspace-dsa/essencials1-7/src/essencials/prova.txt");
		BufferedReader Bf;
		String total;

		try {
			Bf = new BufferedReader(new FileReader(f));
			int contador = 0;
			while (Bf.ready()) {
				total = Bf.readLine();
				contador = contador + total.length();
			}
			Bf.close();
			
			Calendar fecha = new GregorianCalendar();
			int any = fecha.get(Calendar.YEAR);
			int mes = fecha.get(Calendar.MONTH);
			int dia = fecha.get(Calendar.DAY_OF_MONTH);
			int hora = fecha.get(Calendar.HOUR_OF_DAY);
			int minuts = fecha.get(Calendar.MINUTE);
			int segons = fecha.get(Calendar.SECOND);
			String date = (dia + "/" + (mes + 1) + "/" + any + " " + hora + ":"
					+ minuts + ":" + segons);
			System.out.println(date);
			System.out.println("Nombre de caracters: " + contador+" fitxer utilitzat: prova.txt");
			File f2 = new File(
					"/home/ernest/workspace-dsa/essencials1-7/src/essencials/registro.txt");
			BufferedWriter Bw = new BufferedWriter(new FileWriter(f2));
			PrintWriter Prw = new PrintWriter(Bw);
			Prw.append(date);
			Prw.close();
			Bw.close();
			

		} catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Exception: " + e.getMessage());
		}

	}

}

