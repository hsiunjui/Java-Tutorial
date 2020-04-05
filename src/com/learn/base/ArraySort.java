package com.learn.base;

import java.util.Arrays;
/**
 * ��������򷽷�
 * @author reyshaw
 *
 */
public class ArraySort {
	// ������
	public static void main(String[] args) {
		int[] arr = {34,53,12,32,56,17};
		ArraySort as = new ArraySort();
		arr = as.selectSort(arr);
		as.printArray(arr);
	}
	
	// ð������(�ȽϹ���ͽ���)
	public int[] bubblingSort(int[] array) {
		int[] arr = Arrays.copyOf(array, array.length);
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	// ѡ������(�ҵ���Сֵ�ٽ���)
	public int[] selectSort(int[] array) {
		int[] arr = Arrays.copyOf(array, array.length);
		int min, temp;
		for(int i = 0; i < arr.length - 1; i++) {
			min = i;
			for(int j = i + 1; j < arr.length; j++) { // �ҳ��Ǹ���Сֵ
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			if(i != min ) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		return arr;
	}
	// ��ӡ����
	public void printArray(int[] array) {
		for(int arr:array) {
			System.out.print(arr + " ");
		}
	}
}
