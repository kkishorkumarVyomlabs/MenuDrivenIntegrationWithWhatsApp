package com.vyom.validator;

import org.apache.commons.lang3.StringUtils;

public enum ValidationType implements EnumType{
	
	
	NOT_NULL(1,"NOT NULL"){
		
		@Override
		public boolean isValid(InputField inputField) {
			if(StringUtils.isBlank(inputField.getValue())){
				inputField.getErrorProperties().put(inputField.getName(), CustomMessage.FIELD_REQUIRED);
				return false;
			}
			return true;
		}

	},
	
	MIN_LENGTH(2, "MIN_LENGTH"){
		
		@Override
		public boolean isValid(InputField inputField) {
			
			if(NOT_NULL.isValid(inputField) == false){
				return false;
			}
			
			if(inputField.getDataType() == DataType.STRING && inputField.getValue().length() < inputField.getMinLength()){
				inputField.getErrorProperties().put(inputField.getName(), CustomMessage.MIN_LENGTH+" "+inputField.getMinLength());
				return false;
			}else if(inputField.getDataType() == DataType.INT && Integer.parseInt(inputField.getValue()) < inputField.getMinLength()){
				inputField.getErrorProperties().put(inputField.getName(), CustomMessage.MIN_LENGTH+" "+inputField.getMinLength());
				return false;
			}else if(inputField.getDataType() == DataType.FLOAT && Float.parseFloat(inputField.getValue()) < inputField.getMinLength()){
				inputField.getErrorProperties().put(inputField.getName(), CustomMessage.MIN_LENGTH+" "+inputField.getMinLength());
				return false;
			}
			return true;
		}
	},
	
	MAX_LENGTH(3, "MAX_LENGTH"){
		
		@Override
		public boolean isValid(InputField inputField) {
			if(inputField.getDataType() == DataType.STRING && inputField.getValue().length() > inputField.getMaxLength()){
				inputField.getErrorProperties().put(inputField.getName(), CustomMessage.MAX_LENGTH+" "+inputField.getMaxLength());
				return false;
			}else if(inputField.getDataType() == DataType.INT && Integer.parseInt(inputField.getValue()) > inputField.getMaxLength()){
				inputField.getErrorProperties().put(inputField.getName(), CustomMessage.MAX_LENGTH+" "+inputField.getMaxLength());
				return false;
			}else if(inputField.getDataType() == DataType.FLOAT && Float.parseFloat(inputField.getValue()) > inputField.getMaxLength()){
				inputField.getErrorProperties().put(inputField.getName(), CustomMessage.MAX_LENGTH+" "+inputField.getMaxLength());
				return false;
			}
			return true;
		}
	},
	
	REGEX(4,"REGEX"){
		
		@Override
		public boolean isValid(InputField inputField) {
			
			if(NOT_NULL.isValid(inputField) == false){
				return false;
			}
			
			if(inputField.getValue().matches(inputField.getRegex().getValue()) == false){
				inputField.getErrorProperties().put(inputField.getName(), inputField.getRegex().getMessage());
				return false;
			}
			return true;
			
		}
	};
	
	
	private final int id;
    private final String name;
	ValidationType(int id, String name) {
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
    public static ValidationType fromId(int id) {
        for (ValidationType staticFormValidator : values()) {
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
