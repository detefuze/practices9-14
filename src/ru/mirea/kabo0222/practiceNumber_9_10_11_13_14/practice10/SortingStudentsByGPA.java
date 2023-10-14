package ru.mirea.kabo0222.practiceNumber_9_10_11_13_14.practice10;

import java.util.Arrays;
public class SortingStudentsByGPA {
    public static void mergeSort(Student[] arr)
    {
        int n = arr.length;
        if (n == 1) return;
        int mid = arr.length/2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n-mid];

        for (int i = 0; i < mid; i++)
            l[i] = arr[i];
        for (int i = mid; i < n; i++)
            r[i-mid] = arr[i];

        mergeSort(l);
        mergeSort(r);
        merge(arr, l, r);
    }

    public static void merge(Student[] arr, Student[] l, Student[] r)
    {
        int n = l.length;
        int m = r.length;
        int i = 0, j = 0, k = 0;

        while (i < n && j < m)
        {
            if (l[i].getPoints() < r[j].getPoints())
            {
                arr[k] = l[i];
                i++;
            }
            else
            {
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < n)
        {
            arr[k] = l[i];
            i++;
        }
        while (j < m)
        {
            arr[k] = r[j];
            j++;
        }
    }

    public static Student[] mergeArrays(Student[] a, Student[] b)
    {
        int n = a.length;
        int m = b.length;
        Student[] res = new Student[n+m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m)
        {
            if (a[i].getPoints() < b[j].getPoints())
            {
                res[k] = a[i];
                i++;
            }
            else
            {
                res[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n)
        {
            res[k] = a[i];
            i++;
        }
        while (j < m)
        {
            res[k] = b[j];
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        HowardStudents student1 = new HowardStudents("Peter", 20, 90);
        HowardStudents student2 = new HowardStudents("Kate", 19, 140);
        HowardStudents student3 = new HowardStudents("Patrick", 21, 100);
        OxfordStudents student4 = new OxfordStudents("Mark", 23, 150);
        OxfordStudents student5 = new OxfordStudents("Mary", 19, 100);
        OxfordStudents student6 = new OxfordStudents("Carl", 19, 105);
        HowardStudents[] HStudents = {student1, student2, student3};
        OxfordStudents[] OStudents = {student4, student5, student6};
        mergeSort(HStudents);
        mergeSort(OStudents);
        System.out.println(Arrays.toString(mergeArrays(HStudents, OStudents)));
    }
}