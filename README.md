 LAB9
Java Lab 9

Write code for Lab 2 Use java code convention  
CLasses must be distributed in packages  
Work with console must be minimal  
Code must contain only that classes that are described in the diagram  
Sorting must use java built-in methods  
Sorting must be implemented in separate method  
No static methods/attributes are allowed (the only exception is a main method)  
You must use an Enum  
Code must be in a separate branch with PR  
Comparison must be implemented using lambdas  
Instead of getters/setters you should use @Data annotation from lombok  
Use maven and Jococo(in build section), FindBugs, PMD, CheckStyle plugins(reporting section)  
Run mvn site and fix errors reported by checkstyle, pmd and findbugs  

To run:

git clone  
Intellij IDEA: push 'RUN'


#Лабораторна 8
Написати код до завдання з лабораторної №2
При записі програми потрібно використовувати домовленості щодо оформлення коду java code convention.1
Класи потрібно грамотно розкласти по пакетах.
Робота з консоллю або консольне меню повинні бути мінімальними.
В коді мають бути присутні лиш ті класи, які містяться на діаграмі класів
Атрибути класів та їх видимість мають співпадати із зазначеними на діаграмі класів. Те саме стосується методів класів
Для сортування слід використати вбудовані методи сортування, доступні в мові Java
Сортування слід реалізувати в окремому методі
Код немає містити статичних методів/атрибутів. Дозволено лиш один статичний метод - main
Код має використовувати перелічувальний тип (Enum)
Код слід залити в окремий репозиторій, попередньо створивши pull request (тобто код слід писати в окремому branch  на його основі зробити pull request)
Реалізація порівняння елементів та їх сортування з використанням лямбда-виразів (приклади використання лямбд:   https://www.mkyong.com/java8/java-8-lambda-comparator-example/, більш детальний опис що таке лямбда: https://habrahabr.ru/post/224593/)
Замість написання сеттерів і геттерів слід використати аннотації Lombok (@Data) - більш детально про цю бібліотеку - https://habr.com/ru/post/438870/ 
Перетворити проект таким чином, щоб його збірку можна було виконувати з-за допомогою  maven. Також підключити наступні плагіни в pom.xml 


#JAVA

 LAB8
