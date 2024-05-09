"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class File {
    constructor(name) {
        this.name = name;
    }
    getName() {
        return this.name;
    }
    list() {
        console.log(`File: ${this.name}`);
    }
}
exports.default = File;
