// file.ts
import FileSystemComponent from './component';

class File implements FileSystemComponent {
  private name: string;

  constructor(name: string) {
    this.name = name;
  }

  getName(): string {
    return this.name;
  }

  list(): void {
    console.log(`File: ${this.name}`);
  }
}

export default File;