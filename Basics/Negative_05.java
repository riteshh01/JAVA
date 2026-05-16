package Basics;

public class Negative_05 {
    /*
Java me negative numbers aur floating-point numbers ko store karne ke liye do alag-alag standard tareeqon ka use kiya jata hai.

Dono ka setup kaafi efficient hai taaki computer ke hardware (CPU) ke saath fast calculations ho sakein. Chaliye dono ko simple shabdon me samajhte hain:

⁡⁣⁣⁢1. How Java Stores Negative Numbers: 2's Complement⁡

Java me saare integer types (byte, short, int, long) signed hote hain, yaani ye positive aur negative dono numbers ko store kar sakte hain. Iske liye Java 2's Complement (two's complement) binary representation ka use karta hai.

Yeh Kaam Kaise Karta Hai?

=> Most Significant Bit (MSB): Kisi bhi number ki sabse pehli bit (leftmost bit) ko Sign Bit kehte hain.

Agar sign bit 0 hai -> right number positive hai.
Agar sign bit 1 hai -> right number negative hai.

Negative Number Nikalne Ka Tarika (Example: -5 in a 8-bit byte)
Agar hume -5 store karna hai, toh Java direct -5 nahi likhta. Wo ye steps follow karta hai:

1) Positive Number ka Binary Likho (5): 00000101
2) Bits ko Invert karo (1's Complement): 11111010 (Saare 0 ko 1 aur 1 ko 0 kar do)
3) Add karo (2's Complement): 11111010 + 1 = 11111011

Toh Java me -5 memory me 11111011 ki tarah store hoga.

Fayda: 2's complement ka sabse bada fayda ye hai ki isse math operations (jaise addition aur subtraction) CPU ke liye bohot simple ho jaate hain. Computer ko subtract karne ke liye alag se dimaag nahi lagana padta, wo bas negative number ko add kar deta hai.


2. How Java Stores Floating-Point Numbers: IEEE 754 Standard

Decimal wale numbers (float aur double) ko store karne ke liye Java IEEE 754 Standard ka use karta hai. Isme number ko Scientific Notation me badla jata hai, jaise hum maths me likhte hain:

                $$\text{Sign} \times \text{Mantissa} \times 2^{\text{Exponent}}$$ (latex code hai)

        +---------+------------+--------------+----------------+------------------------+
        | Type    | Total Bits | Sign Bit (S) | Exponent (E)   | Mantissa / Fraction(M) |
        +---------+------------+--------------+----------------+------------------------+
        | float   | 32 bits    | 1 bit        | 8 bits         | 23 bits                |
        | double  | 64 bits    | 1 bit        | 11 bits        | 52 bits                |
        +---------+------------+--------------+----------------+------------------------+


In Teeno Parts Ka Matlab:
Sign Bit (1 bit):

0 matlab positive, 1 matlab negative.

Exponent:

Ye batata hai ki decimal point ko kitna shift karna hai. Isme ek bias (float ke liye 127, double ke liye 1023) add kiya jata hai taaki negative exponents ko bhi positive binary me store kiya ja sake.

Mantissa (Fraction):

Ye actual digits hote hain. Binary me scientific notation hamesha 1.xxxx se shuru hota hai, isliye pehle 1 ko store karne ki zaroorat nahi hoti (it's implicit). Bas xxxx wale part ko Mantissa me store kiya jata hai.

⁡⁢⁣⁢Ek Choti Si Problem (Rounding Error)⁡

Floating-point numbers binary me store hote hain, isliye kuch decimal fractions (jaise 0.1 ya 0.2) binary me perfectly convert nahi ho paate (wo infinite repeat hote hain).

Isi wajah se Java me kabhi-kabhi 0.1 + 0.2 ka result 0.30000000000000004 aata hai. Agar aapko bilkul exact currency ya money calculations karni hon, toh Java me float/double ki jagah BigDecimal class ka use kiya jata hai.
    */

}
