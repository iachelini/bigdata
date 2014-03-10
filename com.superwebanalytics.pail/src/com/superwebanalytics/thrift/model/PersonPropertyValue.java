package com.superwebanalytics.thrift.model;

/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.thrift.protocol.TProtocolException;

public class PersonPropertyValue
		extends
		org.apache.thrift.TUnion<PersonPropertyValue, PersonPropertyValue._Fields> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"PersonPropertyValue");
	private static final org.apache.thrift.protocol.TField FULL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"full_name", org.apache.thrift.protocol.TType.STRING, (short) 1);
	private static final org.apache.thrift.protocol.TField GENDER_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"gender", org.apache.thrift.protocol.TType.I32, (short) 2);
	private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"location", org.apache.thrift.protocol.TType.STRUCT, (short) 3);
	private static final org.apache.thrift.protocol.TField AGE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"age", org.apache.thrift.protocol.TType.I16, (short) 4);

	/**
	 * The set of fields this struct contains, along with convenience methods
	 * for finding and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		FULL_NAME((short) 1, "full_name"),
		/**
		 * 
		 * @see GenderType
		 */
		GENDER((short) 2, "gender"), LOCATION((short) 3, "location"), AGE(
				(short) 4, "age");

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static {
			for (_Fields field : EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not
		 * found.
		 */
		public static _Fields findByThriftId(int fieldId) {
			switch (fieldId) {
			case 1: // FULL_NAME
				return FULL_NAME;
			case 2: // GENDER
				return GENDER;
			case 3: // LOCATION
				return LOCATION;
			case 4: // AGE
				return AGE;
			default:
				return null;
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, throwing an exception
		 * if it is not found.
		 */
		public static _Fields findByThriftIdOrThrow(int fieldId) {
			_Fields fields = findByThriftId(fieldId);
			if (fields == null)
				throw new IllegalArgumentException("Field " + fieldId
						+ " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not
		 * found.
		 */
		public static _Fields findByName(String name) {
			return byName.get(name);
		}

		private final short _thriftId;
		private final String _fieldName;

		_Fields(short thriftId, String fieldName) {
			_thriftId = thriftId;
			_fieldName = fieldName;
		}

		public short getThriftFieldId() {
			return _thriftId;
		}

		public String getFieldName() {
			return _fieldName;
		}
	}

	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.FULL_NAME,
				new org.apache.thrift.meta_data.FieldMetaData("full_name",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(
								org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.GENDER,
				new org.apache.thrift.meta_data.FieldMetaData("gender",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.EnumMetaData(
								org.apache.thrift.protocol.TType.ENUM,
								GenderType.class)));
		tmpMap.put(_Fields.LOCATION,
				new org.apache.thrift.meta_data.FieldMetaData("location",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.StructMetaData(
								org.apache.thrift.protocol.TType.STRUCT,
								Location.class)));
		tmpMap.put(_Fields.AGE, new org.apache.thrift.meta_data.FieldMetaData(
				"age", org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.FieldValueMetaData(
						org.apache.thrift.protocol.TType.I16)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(
				PersonPropertyValue.class, metaDataMap);
	}

	public PersonPropertyValue() {
		super();
	}

	public PersonPropertyValue(_Fields setField, Object value) {
		super(setField, value);
	}

	public PersonPropertyValue(PersonPropertyValue other) {
		super(other);
	}

	public PersonPropertyValue deepCopy() {
		return new PersonPropertyValue(this);
	}

	public static PersonPropertyValue full_name(String value) {
		PersonPropertyValue x = new PersonPropertyValue();
		x.setFull_name(value);
		return x;
	}

	public static PersonPropertyValue gender(GenderType value) {
		PersonPropertyValue x = new PersonPropertyValue();
		x.setGender(value);
		return x;
	}

	public static PersonPropertyValue location(Location value) {
		PersonPropertyValue x = new PersonPropertyValue();
		x.setLocation(value);
		return x;
	}

	public static PersonPropertyValue age(short value) {
		PersonPropertyValue x = new PersonPropertyValue();
		x.setAge(value);
		return x;
	}

	@Override
	protected void checkType(_Fields setField, Object value)
			throws ClassCastException {
		switch (setField) {
		case FULL_NAME:
			if (value instanceof String) {
				break;
			}
			throw new ClassCastException(
					"Was expecting value of type String for field 'full_name', but got "
							+ value.getClass().getSimpleName());
		case GENDER:
			if (value instanceof GenderType) {
				break;
			}
			throw new ClassCastException(
					"Was expecting value of type GenderType for field 'gender', but got "
							+ value.getClass().getSimpleName());
		case LOCATION:
			if (value instanceof Location) {
				break;
			}
			throw new ClassCastException(
					"Was expecting value of type Location for field 'location', but got "
							+ value.getClass().getSimpleName());
		case AGE:
			if (value instanceof Short) {
				break;
			}
			throw new ClassCastException(
					"Was expecting value of type Short for field 'age', but got "
							+ value.getClass().getSimpleName());
		default:
			throw new IllegalArgumentException("Unknown field id " + setField);
		}
	}

	@Override
	protected Object standardSchemeReadValue(
			org.apache.thrift.protocol.TProtocol iprot,
			org.apache.thrift.protocol.TField field)
			throws org.apache.thrift.TException {
		_Fields setField = _Fields.findByThriftId(field.id);
		if (setField != null) {
			switch (setField) {
			case FULL_NAME:
				if (field.type == FULL_NAME_FIELD_DESC.type) {
					String full_name;
					full_name = iprot.readString();
					return full_name;
				} else {
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
							field.type);
					return null;
				}
			case GENDER:
				if (field.type == GENDER_FIELD_DESC.type) {
					GenderType gender;
					gender = GenderType.findByValue(iprot.readI32());
					return gender;
				} else {
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
							field.type);
					return null;
				}
			case LOCATION:
				if (field.type == LOCATION_FIELD_DESC.type) {
					Location location;
					location = new Location();
					location.read(iprot);
					return location;
				} else {
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
							field.type);
					return null;
				}
			case AGE:
				if (field.type == AGE_FIELD_DESC.type) {
					Short age;
					age = iprot.readI16();
					return age;
				} else {
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
							field.type);
					return null;
				}
			default:
				throw new IllegalStateException(
						"setField wasn't null, but didn't match any of the case statements!");
			}
		} else {
			return null;
		}
	}

	@Override
	protected void standardSchemeWriteValue(
			org.apache.thrift.protocol.TProtocol oprot)
			throws org.apache.thrift.TException {
		switch (setField_) {
		case FULL_NAME:
			String full_name = (String) value_;
			oprot.writeString(full_name);
			return;
		case GENDER:
			GenderType gender = (GenderType) value_;
			oprot.writeI32(gender.getValue());
			return;
		case LOCATION:
			Location location = (Location) value_;
			location.write(oprot);
			return;
		case AGE:
			Short age = (Short) value_;
			oprot.writeI16(age);
			return;
		default:
			throw new IllegalStateException(
					"Cannot write union with unknown field " + setField_);
		}
	}

	@Override
	protected Object tupleSchemeReadValue(
			org.apache.thrift.protocol.TProtocol iprot, short fieldID)
			throws org.apache.thrift.TException {
		_Fields setField = _Fields.findByThriftId(fieldID);
		if (setField != null) {
			switch (setField) {
			case FULL_NAME:
				String full_name;
				full_name = iprot.readString();
				return full_name;
			case GENDER:
				GenderType gender;
				gender = GenderType.findByValue(iprot.readI32());
				return gender;
			case LOCATION:
				Location location;
				location = new Location();
				location.read(iprot);
				return location;
			case AGE:
				Short age;
				age = iprot.readI16();
				return age;
			default:
				throw new IllegalStateException(
						"setField wasn't null, but didn't match any of the case statements!");
			}
		} else {
			throw new TProtocolException("Couldn't find a field with field id "
					+ fieldID);
		}
	}

	@Override
	protected void tupleSchemeWriteValue(
			org.apache.thrift.protocol.TProtocol oprot)
			throws org.apache.thrift.TException {
		switch (setField_) {
		case FULL_NAME:
			String full_name = (String) value_;
			oprot.writeString(full_name);
			return;
		case GENDER:
			GenderType gender = (GenderType) value_;
			oprot.writeI32(gender.getValue());
			return;
		case LOCATION:
			Location location = (Location) value_;
			location.write(oprot);
			return;
		case AGE:
			Short age = (Short) value_;
			oprot.writeI16(age);
			return;
		default:
			throw new IllegalStateException(
					"Cannot write union with unknown field " + setField_);
		}
	}

	@Override
	protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
		switch (setField) {
		case FULL_NAME:
			return FULL_NAME_FIELD_DESC;
		case GENDER:
			return GENDER_FIELD_DESC;
		case LOCATION:
			return LOCATION_FIELD_DESC;
		case AGE:
			return AGE_FIELD_DESC;
		default:
			throw new IllegalArgumentException("Unknown field id " + setField);
		}
	}

	@Override
	protected org.apache.thrift.protocol.TStruct getStructDesc() {
		return STRUCT_DESC;
	}

	@Override
	protected _Fields enumForId(short id) {
		return _Fields.findByThriftIdOrThrow(id);
	}

	public _Fields fieldForId(int fieldId) {
		return _Fields.findByThriftId(fieldId);
	}

	public String getFull_name() {
		if (getSetField() == _Fields.FULL_NAME) {
			return (String) getFieldValue();
		} else {
			throw new RuntimeException(
					"Cannot get field 'full_name' because union is currently set to "
							+ getFieldDesc(getSetField()).name);
		}
	}

	public void setFull_name(String value) {
		if (value == null)
			throw new NullPointerException();
		setField_ = _Fields.FULL_NAME;
		value_ = value;
	}

	/**
	 * 
	 * @see GenderType
	 */
	public GenderType getGender() {
		if (getSetField() == _Fields.GENDER) {
			return (GenderType) getFieldValue();
		} else {
			throw new RuntimeException(
					"Cannot get field 'gender' because union is currently set to "
							+ getFieldDesc(getSetField()).name);
		}
	}

	/**
	 * 
	 * @see GenderType
	 */
	public void setGender(GenderType value) {
		if (value == null)
			throw new NullPointerException();
		setField_ = _Fields.GENDER;
		value_ = value;
	}

	public Location getLocation() {
		if (getSetField() == _Fields.LOCATION) {
			return (Location) getFieldValue();
		} else {
			throw new RuntimeException(
					"Cannot get field 'location' because union is currently set to "
							+ getFieldDesc(getSetField()).name);
		}
	}

	public void setLocation(Location value) {
		if (value == null)
			throw new NullPointerException();
		setField_ = _Fields.LOCATION;
		value_ = value;
	}

	public short getAge() {
		if (getSetField() == _Fields.AGE) {
			return (Short) getFieldValue();
		} else {
			throw new RuntimeException(
					"Cannot get field 'age' because union is currently set to "
							+ getFieldDesc(getSetField()).name);
		}
	}

	public void setAge(short value) {
		setField_ = _Fields.AGE;
		value_ = value;
	}

	public boolean isSetFull_name() {
		return setField_ == _Fields.FULL_NAME;
	}

	public boolean isSetGender() {
		return setField_ == _Fields.GENDER;
	}

	public boolean isSetLocation() {
		return setField_ == _Fields.LOCATION;
	}

	public boolean isSetAge() {
		return setField_ == _Fields.AGE;
	}

	public boolean equals(Object other) {
		if (other instanceof PersonPropertyValue) {
			return equals((PersonPropertyValue) other);
		} else {
			return false;
		}
	}

	public boolean equals(PersonPropertyValue other) {
		return other != null && getSetField() == other.getSetField()
				&& getFieldValue().equals(other.getFieldValue());
	}

	@Override
	public int compareTo(PersonPropertyValue other) {
		int lastComparison = org.apache.thrift.TBaseHelper.compareTo(
				getSetField(), other.getSetField());
		if (lastComparison == 0) {
			return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(),
					other.getFieldValue());
		}
		return lastComparison;
	}

	/**
	 * If you'd like this to perform more respectably, use the hashcode
	 * generator option.
	 */
	@Override
	public int hashCode() {
		return 0;
	}

	private void writeObject(java.io.ObjectOutputStream out)
			throws java.io.IOException {
		try {
			write(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(out)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in)
			throws java.io.IOException, ClassNotFoundException {
		try {
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

}