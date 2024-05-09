// main.ts
import File from './file';
import Directory from './directory';

const file1 = new File("Document1.txt");
const file2 = new File("Document2.txt");
const file3 = new File("Picture.png");

const directory1 = new Directory("Documents");
directory1.add(file1);
directory1.add(file2);

const directory2 = new Directory("Images");
directory2.add(file3);

const root = new Directory("Root");
root.add(directory1);
root.add(directory2);

root.list();
