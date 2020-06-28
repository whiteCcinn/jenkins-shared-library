package org.mingchao;

// point in 3D space
class Point {
  float x,y,z;

  Point(x,y,z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  int Total() {
    return this.x + this.y + this.z;
  }
}