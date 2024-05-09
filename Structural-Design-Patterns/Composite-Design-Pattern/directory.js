"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class Directory {
    constructor(name) {
        this.children = [];
        this.name = name;
    }
    getName() {
        return this.name;
    }
    add(component) {
        this.children.push(component);
    }
    remove(component) {
        const index = this.children.indexOf(component);
        if (index !== -1) {
            this.children.splice(index, 1);
        }
    }
    list() {
        console.log(`Directory: ${this.name}`);
        this.children.forEach(child => {
            child.list();
        });
    }
}
exports.default = Directory;
