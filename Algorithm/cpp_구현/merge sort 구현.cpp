#include <iostream>
#define SIZE 10

void printData(int data[], int size);
void partition(int data[], int left, int right);
void merge(int data[], int left, int mid, int right);

int main() {
    int data[SIZE] = {7, 1, 8, 3, 4, 2, 0, 9, 5, 6};
    
    printData(data, SIZE);
    partition(data, 0, SIZE-1);
    printData(data, SIZE);
    
    return 0;
}

void printData(int data[], int size) {
    for(int i = 0; i < size; i++) {
        std::cout << data[i] << ' ';
    }
    std::cout << '\n';
}

void partition(int data[], int left, int right) {
    int mid;
    
    if(left < right) {
        mid = (left + right) / 2;
        partition(data, left, mid);
        partition(data, mid+1, right);
        merge(data, left, mid, right);
    }
}

void merge(int data[], int left, int mid, int right) {
    int i = left;
    int j = mid + 1;
    int k = left;
    
    int temp[SIZE];
    
    while(i <= mid && j <= right) {
        if(data[i] <= data[j]) {
            temp[k] = data[i];
            i++;
        }
        else {
            temp[k] = data[j];
            j++;
        }
        k++;
    }
    
    if(i > mid) {
        for(int m = j; m <= right; m++) {
            temp[k] = data[m];
            k++;
        }
    }
    else {
        for(int m = i; m <= mid; m++) {
            temp[k] = data[m];
            k++;
        }
    }
    
    for(int m = left; m <= right; m++) {
        data[m] = temp[m];
    }
}
