"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
// main.ts
const file_1 = __importDefault(require("./file"));
const directory_1 = __importDefault(require("./directory"));
const file1 = new file_1.default("Document1.txt");
const file2 = new file_1.default("Document2.txt");
const file3 = new file_1.default("Picture.png");
const directory1 = new directory_1.default("Documents");
directory1.add(file1);
directory1.add(file2);
const directory2 = new directory_1.default("Images");
directory2.add(file3);
const root = new directory_1.default("Root");
root.add(directory1);
root.add(directory2);
root.list();
