//#include <stdio.h>
//int main() {
//    char n[100] = { 0 }; // 把char数组的第一个值赋值为0，剩下的全是'\0'
//    printf("请输入数字：");
//    while (scanf_s("%[^\n]s", n, 100) != -1) {
//        // C语言的scanf是按照字节流的形式读取数据的，比如我输入123然后回车确认，
//        // 存到缓冲区中的字符就是123'\n' 因为根据正则表达式，除了\n都读到变量n中，
//        // 所以当他全部都读出去时，缓冲区还剩下一个\n
//        getchar(); // 从缓冲区取出一个字符，用来把刚才没取出来的'\n'取出来
//        printf("一共有%d位\n", printf("%s", n));
//        printf("请输入数字：");
//    }
//    return 0;
//}