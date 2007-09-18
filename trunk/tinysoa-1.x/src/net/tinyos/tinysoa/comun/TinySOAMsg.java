/*
 * "Copyright (c) 2005-2006 The Regents of the Centro de Investigación y de
 * Educación Superior de la ciudad de Ensenada, Baja California (CICESE).
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation for any purpose, without fee, and without written agreement is
 * hereby granted, provided that the above copyright notice, the following
 * two paragraphs and the author appear in all copies of this software.
 * 
 * IN NO EVENT SHALL CICESE BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
 * SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OF THIS
 * SOFTWARE AND ITS DOCUMENTATION, EVEN IF CICESE HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 * CICESE SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.  THE SOFTWARE PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND CICESE
 * HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS,
 * OR MODIFICATIONS."
 * 
 ******************************************************************************/

package net.tinyos.tinysoa.comun;

/*******************************************************************************
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'TinySOAMsg'
 * message type.
 * 
 * @author		Edgardo Avilés López
 * @version	0.3, 07/24/2006
 ******************************************************************************/

public class TinySOAMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 21;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 24;
    
    public static final int MI_OFFSET = 8 * 7;

    /** Create a new TinySOAMsg of size 21. */
    public TinySOAMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new TinySOAMsg of the given data_length. */
    public TinySOAMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TinySOAMsg with the given data_length
     * and base offset.
     */
    public TinySOAMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TinySOAMsg using the given byte array
     * as backing store.
     */
    public TinySOAMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TinySOAMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public TinySOAMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TinySOAMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public TinySOAMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TinySOAMsg embedded in the given message
     * at the given base offset.
     */
    public TinySOAMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new TinySOAMsg embedded in the given message
     * at the given base offset and length.
     */
    public TinySOAMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <TinySOAMsg> \n";
      try {
        s += "  [l1=0x"+Long.toHexString(get_l1())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [l2=0x"+Long.toHexString(get_l2())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [l3=0x"+Long.toHexString(get_l3())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [l4=0x"+Long.toHexString(get_l4())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [l5=0x"+Long.toHexString(get_l5())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [l6=0x"+Long.toHexString(get_l6())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [l7=0x"+Long.toHexString(get_l7())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [l8=0x"+Long.toHexString(get_l8())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [id=0x"+Long.toHexString(get_id())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [padre=0x"+Long.toHexString(get_padre())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nsec=0x"+Long.toHexString(get_nsec())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [sensor=0x"+Long.toHexString(get_sensor())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [tipo=0x"+Long.toHexString(get_tipo())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: l1
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'l1' is signed (false).
     */
    public static boolean isSigned_l1() {
        return false;
    }

    /**
     * Return whether the field 'l1' is an array (false).
     */
    public static boolean isArray_l1() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'l1'
     */
    public static int offset_l1() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'l1'
     */
    public static int offsetBits_l1() {
        return 0 + MI_OFFSET;
    }

    /**
     * Return the value (as a int) of the field 'l1'
     */
    public int get_l1() {
        return (int)getUIntElement(offsetBits_l1(), 16);
    }

    /**
     * Set the value of the field 'l1'
     */
    public void set_l1(int value) {
        setUIntElement(offsetBits_l1(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'l1'
     */
    public static int size_l1() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'l1'
     */
    public static int sizeBits_l1() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: l2
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'l2' is signed (false).
     */
    public static boolean isSigned_l2() {
        return false;
    }

    /**
     * Return whether the field 'l2' is an array (false).
     */
    public static boolean isArray_l2() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'l2'
     */
    public static int offset_l2() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'l2'
     */
    public static int offsetBits_l2() {
        return 16 + MI_OFFSET;
    }

    /**
     * Return the value (as a int) of the field 'l2'
     */
    public int get_l2() {
        return (int)getUIntElement(offsetBits_l2(), 16);
    }

    /**
     * Set the value of the field 'l2'
     */
    public void set_l2(int value) {
        setUIntElement(offsetBits_l2(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'l2'
     */
    public static int size_l2() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'l2'
     */
    public static int sizeBits_l2() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: l3
    //   Field type: int, unsigned
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'l3' is signed (false).
     */
    public static boolean isSigned_l3() {
        return false;
    }

    /**
     * Return whether the field 'l3' is an array (false).
     */
    public static boolean isArray_l3() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'l3'
     */
    public static int offset_l3() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'l3'
     */
    public static int offsetBits_l3() {
        return 32 + MI_OFFSET;
    }

    /**
     * Return the value (as a int) of the field 'l3'
     */
    public int get_l3() {
        return (int)getUIntElement(offsetBits_l3(), 16);
    }

    /**
     * Set the value of the field 'l3'
     */
    public void set_l3(int value) {
        setUIntElement(offsetBits_l3(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'l3'
     */
    public static int size_l3() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'l3'
     */
    public static int sizeBits_l3() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: l4
    //   Field type: int, unsigned
    //   Offset (bits): 48
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'l4' is signed (false).
     */
    public static boolean isSigned_l4() {
        return false;
    }

    /**
     * Return whether the field 'l4' is an array (false).
     */
    public static boolean isArray_l4() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'l4'
     */
    public static int offset_l4() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'l4'
     */
    public static int offsetBits_l4() {
        return 48 + MI_OFFSET;
    }

    /**
     * Return the value (as a int) of the field 'l4'
     */
    public int get_l4() {
        return (int)getUIntElement(offsetBits_l4(), 16);
    }

    /**
     * Set the value of the field 'l4'
     */
    public void set_l4(int value) {
        setUIntElement(offsetBits_l4(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'l4'
     */
    public static int size_l4() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'l4'
     */
    public static int sizeBits_l4() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: l5
    //   Field type: int, unsigned
    //   Offset (bits): 64
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'l5' is signed (false).
     */
    public static boolean isSigned_l5() {
        return false;
    }

    /**
     * Return whether the field 'l5' is an array (false).
     */
    public static boolean isArray_l5() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'l5'
     */
    public static int offset_l5() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'l5'
     */
    public static int offsetBits_l5() {
        return 64 + MI_OFFSET;
    }

    /**
     * Return the value (as a int) of the field 'l5'
     */
    public int get_l5() {
        return (int)getUIntElement(offsetBits_l5(), 16);
    }

    /**
     * Set the value of the field 'l5'
     */
    public void set_l5(int value) {
        setUIntElement(offsetBits_l5(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'l5'
     */
    public static int size_l5() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'l5'
     */
    public static int sizeBits_l5() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: l6
    //   Field type: int, unsigned
    //   Offset (bits): 80
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'l6' is signed (false).
     */
    public static boolean isSigned_l6() {
        return false;
    }

    /**
     * Return whether the field 'l6' is an array (false).
     */
    public static boolean isArray_l6() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'l6'
     */
    public static int offset_l6() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'l6'
     */
    public static int offsetBits_l6() {
        return 80 + MI_OFFSET;
    }

    /**
     * Return the value (as a int) of the field 'l6'
     */
    public int get_l6() {
        return (int)getUIntElement(offsetBits_l6(), 16);
    }

    /**
     * Set the value of the field 'l6'
     */
    public void set_l6(int value) {
        setUIntElement(offsetBits_l6(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'l6'
     */
    public static int size_l6() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'l6'
     */
    public static int sizeBits_l6() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: l7
    //   Field type: int, unsigned
    //   Offset (bits): 96
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'l7' is signed (false).
     */
    public static boolean isSigned_l7() {
        return false;
    }

    /**
     * Return whether the field 'l7' is an array (false).
     */
    public static boolean isArray_l7() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'l7'
     */
    public static int offset_l7() {
        return (96 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'l7'
     */
    public static int offsetBits_l7() {
        return 96 + MI_OFFSET;
    }

    /**
     * Return the value (as a int) of the field 'l7'
     */
    public int get_l7() {
        return (int)getUIntElement(offsetBits_l7(), 16);
    }

    /**
     * Set the value of the field 'l7'
     */
    public void set_l7(int value) {
        setUIntElement(offsetBits_l7(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'l7'
     */
    public static int size_l7() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'l7'
     */
    public static int sizeBits_l7() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: l8
    //   Field type: int, unsigned
    //   Offset (bits): 112
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'l8' is signed (false).
     */
    public static boolean isSigned_l8() {
        return false;
    }

    /**
     * Return whether the field 'l8' is an array (false).
     */
    public static boolean isArray_l8() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'l8'
     */
    public static int offset_l8() {
        return (112 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'l8'
     */
    public static int offsetBits_l8() {
        return 112 + MI_OFFSET;
    }

    /**
     * Return the value (as a int) of the field 'l8'
     */
    public int get_l8() {
        return (int)getUIntElement(offsetBits_l8(), 16);
    }

    /**
     * Set the value of the field 'l8'
     */
    public void set_l8(int value) {
        setUIntElement(offsetBits_l8(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'l8'
     */
    public static int size_l8() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'l8'
     */
    public static int sizeBits_l8() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: id
    //   Field type: short, unsigned
    //   Offset (bits): 128
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'id' is signed (false).
     */
    public static boolean isSigned_id() {
        return false;
    }

    /**
     * Return whether the field 'id' is an array (false).
     */
    public static boolean isArray_id() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'id'
     */
    public static int offset_id() {
        return (128 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'id'
     */
    public static int offsetBits_id() {
        return 128 + MI_OFFSET;
    }

    /**
     * Return the value (as a short) of the field 'id'
     */
    public short get_id() {
        return (short)getUIntElement(offsetBits_id(), 8);
    }

    /**
     * Set the value of the field 'id'
     */
    public void set_id(short value) {
        setUIntElement(offsetBits_id(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'id'
     */
    public static int size_id() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'id'
     */
    public static int sizeBits_id() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: padre
    //   Field type: short, unsigned
    //   Offset (bits): 136
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'padre' is signed (false).
     */
    public static boolean isSigned_padre() {
        return false;
    }

    /**
     * Return whether the field 'padre' is an array (false).
     */
    public static boolean isArray_padre() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'padre'
     */
    public static int offset_padre() {
        return (136 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'padre'
     */
    public static int offsetBits_padre() {
        return 136 + MI_OFFSET;
    }

    /**
     * Return the value (as a short) of the field 'padre'
     */
    public short get_padre() {
        return (short)getUIntElement(offsetBits_padre(), 8);
    }

    /**
     * Set the value of the field 'padre'
     */
    public void set_padre(short value) {
        setUIntElement(offsetBits_padre(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'padre'
     */
    public static int size_padre() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'padre'
     */
    public static int sizeBits_padre() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nsec
    //   Field type: short, unsigned
    //   Offset (bits): 144
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nsec' is signed (false).
     */
    public static boolean isSigned_nsec() {
        return false;
    }

    /**
     * Return whether the field 'nsec' is an array (false).
     */
    public static boolean isArray_nsec() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nsec'
     */
    public static int offset_nsec() {
        return (144 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nsec'
     */
    public static int offsetBits_nsec() {
        return 144 + MI_OFFSET;
    }

    /**
     * Return the value (as a short) of the field 'nsec'
     */
    public short get_nsec() {
        return (short)getUIntElement(offsetBits_nsec(), 8);
    }

    /**
     * Set the value of the field 'nsec'
     */
    public void set_nsec(short value) {
        setUIntElement(offsetBits_nsec(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'nsec'
     */
    public static int size_nsec() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nsec'
     */
    public static int sizeBits_nsec() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: sensor
    //   Field type: short, unsigned
    //   Offset (bits): 152
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'sensor' is signed (false).
     */
    public static boolean isSigned_sensor() {
        return false;
    }

    /**
     * Return whether the field 'sensor' is an array (false).
     */
    public static boolean isArray_sensor() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'sensor'
     */
    public static int offset_sensor() {
        return (152 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'sensor'
     */
    public static int offsetBits_sensor() {
        return 152 + MI_OFFSET;
    }

    /**
     * Return the value (as a short) of the field 'sensor'
     */
    public short get_sensor() {
        return (short)getUIntElement(offsetBits_sensor(), 8);
    }

    /**
     * Set the value of the field 'sensor'
     */
    public void set_sensor(short value) {
        setUIntElement(offsetBits_sensor(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'sensor'
     */
    public static int size_sensor() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'sensor'
     */
    public static int sizeBits_sensor() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: tipo
    //   Field type: short, unsigned
    //   Offset (bits): 160
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'tipo' is signed (false).
     */
    public static boolean isSigned_tipo() {
        return false;
    }

    /**
     * Return whether the field 'tipo' is an array (false).
     */
    public static boolean isArray_tipo() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'tipo'
     */
    public static int offset_tipo() {
        return (160 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'tipo'
     */
    public static int offsetBits_tipo() {
        return 160 + MI_OFFSET;
    }

    /**
     * Return the value (as a short) of the field 'tipo'
     */
    public short get_tipo() {
        return (short)getUIntElement(offsetBits_tipo(), 8);
    }

    /**
     * Set the value of the field 'tipo'
     */
    public void set_tipo(short value) {
        setUIntElement(offsetBits_tipo(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'tipo'
     */
    public static int size_tipo() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'tipo'
     */
    public static int sizeBits_tipo() {
        return 8;
    }

}
