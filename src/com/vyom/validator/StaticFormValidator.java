package com.vyom.validator;

import org.apache.commons.lang3.StringUtils;

public enum StaticFormValidator implements EnumType{
	
	VALIDATE_NAME(1,"VALIDATE_NAME"){
		@Override
		public boolean isValid(InputField inputField) {
			if(ValidationType.NOT_NULL.isValid(inputField) == false || ValidationType.MAX_LENGTH.isValid(inputField) == false || ValidationType.REGEX.isValid(inputField) == false){
				return false;
			}
			return true;
		}
	},
	
	VALIDATE_CODE(2,"VALIDATE_CODE"){
		@Override
		public boolean isValid(InputField inputField) {
			if(ValidationType.NOT_NULL.isValid(inputField) == false || ValidationType.MAX_LENGTH.isValid(inputField) == false || ValidationType.REGEX.isValid(inputField) == false){
				return false;
			}
			return true;
		}
	},
	
	VALIDATE_DESCRIPTION(3,"VALIDATE_DESCRIPTION"){
		@Override
		public boolean isValid(InputField inputField) {
			if(StringUtils.isBlank(inputField.getValue()) == false){
				if(ValidationType.MAX_LENGTH.isValid(inputField) == false || ValidationType.REGEX.isValid(inputField) == false){
					return false;
				}	
			}
			return true;
		}
	},
	
	VALIDATE_COUNTRY_CODE(4,"VALIDATE_COUNTRY_CODE"){
		@Override
		public boolean isValid(InputField inputField) {
			if(ValidationType.NOT_NULL.isValid(inputField) == false || ValidationType.MIN_LENGTH.isValid(inputField) == false || 
					ValidationType.MAX_LENGTH.isValid(inputField) == false || ValidationType.REGEX.isValid(inputField) == false){
				return false;
			}
			return true;
		}
	},
	
	VALIDATE_CONTACT_NO(5,"VALIDATE_CONTACT_NO"){
		@Override
		public boolean isValid(InputField inputField) {
			if(ValidationType.NOT_NULL.isValid(inputField) == false || ValidationType.MIN_LENGTH.isValid(inputField) == false || 
					ValidationType.MAX_LENGTH.isValid(inputField) == false || ValidationType.REGEX.isValid(inputField) == false){
				return false;
			}
			return true;
		}
	},
	
	EMAIL(6,"EMAIL"){
		@Override
		public boolean isValid(InputField inputField) {
			if(ValidationType.NOT_NULL.isValid(inputField) == false || ValidationType.MAX_LENGTH.isValid(inputField) == false || ValidationType.REGEX.isValid(inputField) == false){
				return false;
			}
			return true;
		}
	},
	
	VALIDATE_USER_ID(7,"VALIDATE_USER_ID"){
		@Override
		public boolean isValid(InputField inputField) {
			if(ValidationType.NOT_NULL.isValid(inputField) == false || ValidationType.MAX_LENGTH.isValid(inputField) == false || ValidationType.REGEX.isValid(inputField) == false){
				return false;
			}
			return true;
		}
	},
	
	VALIDATE_FIRST_NAME(8,"VALIDATE_FIRST_NAME"){
		@Override
		public boolean isValid(InputField inputField) {
			if(ValidationType.NOT_NULL.isValid(inputField) == false || ValidationType.MAX_LENGTH.isValid(inputField) == false || ValidationType.REGEX.isValid(inputField) == false){
				return false;
			}
			return true;
		}		
	},
	
	VALIDATE_LAST_NAME(8,"VALIDATE_LAST_NAME"){
		@Override
		public boolean isValid(InputField inputField) {
			if(ValidationType.NOT_NULL.isValid(inputField) == false || ValidationType.MAX_LENGTH.isValid(inputField) == false || ValidationType.REGEX.isValid(inputField) == false){
				return false;
			}
			return true;
		}
	},
	VALIDATE_SUBJECT(9,"VALIDATE_SUBJECT"){
		@Override
		public boolean isValid(InputField inputField) {
			if(ValidationType.NOT_NULL.isValid(inputField) == false || ValidationType.MAX_LENGTH.isValid(inputField) == false || ValidationType.REGEX.isValid(inputField) == false){
				return false;
			}
			return true;
		}
	},
	VALIDATE_TEMPLATE_TEXT(10,"VALIDATE_TEMPLATE_TEXT"){
		@Override
		public boolean isValid(InputField inputField) {
			if(ValidationType.NOT_NULL.isValid(inputField) == false){
				return false;
			}
			return true;
		}
	};
	
	private final int id;
    private final String name;
	StaticFormValidator(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
	 * This methods is used to fetch Enum base on given id.
	 * @param code enum key
	 * @return CommonStatus enum
	 */
    public static StaticFormValidator fromId(int id) {
        for (StaticFormValidator staticFormValidator : values()) {
            if (staticFormValidator.getId() == id) {
                return staticFormValidator;
            }
        }
        return null;
    }

    /**
     * This method is called by enum to check given field value is valid or not.
     * @param inputField
     * @return boolean
     */
	public abstract boolean isValid(InputField inputField);
	
}
