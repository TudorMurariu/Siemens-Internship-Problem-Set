1. In ce an estimezi sa finalizezi studiile (ex. sunt anul 3/4 sau nu mai sunt stundent) ?

**Raspuns: Sunt student in anul 2 din 3 estimez ca in 2 ani imi voi termina studiile.**

2. Care ar fi optiunile tale pentru acest internship ?
a) Doresc numai Azure DevOPS
b) Doresc numai Dynamics
c) Sunt interesat/a de ambele variante, respectiv care sunt prioritatile ?

**Raspuns: c) Sunt interesat de ambele, Dynamics avand prioritate.**


**Problem 1**

Given the large number of cow farms in the area he lives in, John decided to establish a milk processing plant which uses the cow milk produced at the local farms and creates various finished goods for the supermarkets of the region. John’s new plant makes two kinds of pasteurized milk boxes: with 1.7% and 3.5% fat content. The plant also produces fruit yoghurt (with peach, strawberry and cherry flavors) and two varieties of sour-cream (with 12% and 20% fat content).

In order to assure the quality of his products, John extended his milk processing plant with a quality lab, which can analyze any of the goods produced at the plant using two types of test-methods (analog and digital). The lab creates fact sheets about the quality of the ingredients of the goods.

1.1.  Please create a class diagram based on the above story.

![alt text](https://github.com/TudorMurariu/Siemens-Internship-Problem-Set/blob/main/UML.PNG)

1.2.  Please create a database diagram based on the previous story.

 ![alt text](https://github.com/TudorMurariu/Siemens-Internship-Problem-Set/blob/main/JhonDataBase.PNG)

A product can have only one quality sheet. <br>
A product can be either a Milk_Box, a Fruit_Yoghurt or a Sour-Cream.

**Problem 2**

Given an N array of strings, each string contains numbers, strings, special characters. The task is to create one array which contains the numbers from all N arrays sorted ascending. Every number should appear once in the final list.

1.1 Create a method which receive as parameter a string and returns an array with all numbers from that list(please use REGEX)

1.2 Using the method from 1.1, create a method which create the final array with the numbers from all N arrays

Example

Input:

N = 3

“12 might 45% internship 2022” , “array of 5 elements” , “ best fo[23]%6c abc 45 “

Here will be 3 arrays of numbers: [12,45,2022], [5], [236,45]

Output:

[5,12,45,236,2022]