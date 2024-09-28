package smatches;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
	 public static void main(String[] args) throws IOException {
	        // Usa BufferedReader para capturar a entrada no console
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        // Lê o número de meias
	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        // Lê as cores das meias
	        List<Integer> ar = new ArrayList<>();
	        String[] items = bufferedReader.readLine().split(" ");
	        for (String item : items) {
	            ar.add(Integer.parseInt(item));
	        }

	        // Chama a função sockMerchant da classe Result
	        int result = Result.sockMerchant(n, ar);

	        // Exibe o resultado no console
	        System.out.println(result);

	        bufferedReader.close();
	    }
 }
