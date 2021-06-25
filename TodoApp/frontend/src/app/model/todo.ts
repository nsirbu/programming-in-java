export class Todo {
  id: string;
  title = '';
  completed = false;

  constructor(values: Object = {}) {
    Object.assign(this, values);
  }
}
