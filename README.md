# GeodesyApp
An application used in the development of geodetic documentation

The main thing is read coordinates from .txt file and replace correct them in the right places in .doc file. 
There are little differences between differences in .txt file and in cells in .doc file.

1. GUI created using Swing.
1. Application reads coordinates from .txt file and keeps it in Map of points. 
2. Scanning .doc file using Apache POI library to find right cells and put there correct coordinates. 
3. Saving .doc file with new coordinates.

.txt file:
![txt](https://github.com/karolk92/GeodesyApp/blob/master/pics/text.PNG)

.doc file:
![docx](https://github.com/karolk92/GeodesyApp/blob/master/pics/docx.PNG)

Choosing .txt file:
![window1](https://github.com/karolk92/GeodesyApp/blob/master/pics/a1.PNG)

Choosing .doc file:
![window2](https://github.com/karolk92/GeodesyApp/blob/master/pics/a2.PNG)

Saving changes:

![window3](https://github.com/karolk92/GeodesyApp/blob/master/pics/a3.PNG)
