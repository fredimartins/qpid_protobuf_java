package qpid_protobuf_java;

public enum QpidTypes {
	qpid_st_none(0,""),
	qpid_st_pb_mtc550_pos(1,"PB_MTC550_POSITION"),
	qpid_st_pb_mtc550_setup(2,"PB_MTC550_SETUP"),
	qpid_st_pb_mxt1xx_pos(3,"PB_MXT1xx_POSITION"),
	qpid_st_pb_mxt1xx_setup(4,"PB_MXT1xx_SETUP"),
	qpid_st_pb_mtc500_pos(5,"PB_MTC500_POSITION"),
	qpid_st_pb_mtc500_setup(6,"PB_MTC500_SETUP"),
	qpid_st_pb_mtc400_pos(7,"PB_MTC400_POSITION"),
	qpid_st_pb_mtc400_setup(8,"PB_MTC400_SETUP"),
	qpid_st_pb_idp780_pos(9,"PB_IDP780_POSITION"),
	qpid_st_pb_idp780_setup(10,"PB_IDP780_SETUP"),
	qpid_st_pb_idp780_setup_var(11,"PB_IDP780_SETUP_VAR"),
	qpid_st_pb_mtc550skywave_pos(12,"PB_MTC550SKYWAVE_POSITION"),
	qpid_st_pb_td50skywave_pos(13,"PB_TD50SKYWAVE_POSITION"),
	qpid_st_pb_mxt1xx_g100(14,"PB_MXT1xx_G100"),
	qpid_st_pb_idp780skywave_pos(15,"PB_IDP780SKYWAVE_POSITION"),
	qpid_st_pb_idp780skywave_setup(16,"PB_IDP780SKYWAVE_SETUP"),
	qpid_st_pb_idp780skywave_setup_var(17,"PB_IDP780SKYWAVE_SETUP_VAR"),
	qpid_st_pb_mtc550_black_box_minute(18,"PB_MTC550_BLACK_BOX_MINUTE"),
	qpid_st_pb_command(19,"PB_COMMAND"),
	qpid_st_pb_command_response(20,"PB_COMMAND_RESPONSE"),
	qpid_st_library_response(21,"LIBRARY_RESPONSE"),
	qpid_st_huge_library_response(22,"HUGE_LIBRARY_RESPONSE"),
	qpid_st_pb_module_connection(23,"PB_MODULE_CONNECTION"),
	qpid_st_pb_mxt1xx_ip_gprs_conn(24,"PB_MXT1xx_IP_GPRS_CONNECTION"),
	qpid_st_pb_mtc550skywave_pos_and_free_data(25,"PB_MTC550SKYWAVE_POSITION_AND_FREE_DATA"),
	qpid_st_pb_command_data_terminal_pwd_generator_response(26,"PB_COMMAND_DATA_TERMINAL_PWD_GENERATOR_RESPONSE"),
	qpid_st_pb_mxt1xx_icc_id_answer(27,"PB_MXT1XX_ICC_ID_ANSWER"),
	qpid_st_pb_mtc550satamatics_pos(28,"PB_MTC550SATAMATICS_POSITION"),
	qpid_st_pb_mtc550satamatics_pos_and_free_data(29,"PB_MTC550SATAMATICS_POSITION_AND_FREE_DATA"),
	qpid_st_pb_idp780_black_box_minute(30,"PB_IDP780_BLACK_BOX_MINUTE"),
	qpid_st_pb_mxt1xx_version_packet(31,"PB_MXT1XX_VERSION_PACKET"),
	qpid_st_pb_idp780skywave_black_box_minute(32,"PB_IDP780SKYWAVE_BLACK_BOX_MINUTE"),
	qpid_st_pb_mtc550_parameters(33,"PB_MTC550_PARAMETERS"),
	qpid_st_pb_idp780skywave_reduced_pos(34,"PB_IDP780SKYWAVE_REDUCED_POSITION"),
	qpid_st_pb_idp780skywave_reduced_embedded_actions(35,"PB_IDP780SKYWAVE_REDUCED_EMBEDDED_ACTION"),
	qpid_st_pb_idp780skywave_reduced_macro(36,"PB_IDP780SKYWAVE_REDUCED_MACRO"),
	qpid_st_pb_idp780skywave_reduced_deltas(37,"PB_IDP780SKYWAVE_REDUCED_DELTAS"),
	qpid_st_pb_idp780skywave_reduced_telemetry_events(38,"PB_IDP780SKYWAVE_REDUCED_TELEMETRY_EVENTS"),
	qpid_st_pb_idp780skywave_reduced_accelerometer_events(39,"PB_IDP780SKYWAVE_REDUCED_ACCELEROMETER_EVENTS"),
	qpid_st_pb_idp780skywave_reduced_trip(40,"PB_IDP780SKYWAVE_REDUCED_TRIP"),
	qpid_st_pb_idp780skywave_reduced_text(41,"PB_IDP780SKYWAVE_REDUCED_TEXT"),
	qpid_st_pb_idp780skywave_reduced_adc(42,"PB_IDP780SKYWAVE_REDUCED_ADC"),
	qpid_st_pb_idp780skywave_reduced_open_data(43,"PB_IDP780SKYWAVE_REDUCED_OPEN_DATA"),
	qpid_st_pb_idp780skywave_reduced_telemetry(44,"PB_IDP780SKYWAVE_REDUCED_TELEMETRY"),
	qpid_st_pb_mtc550skywave_reduced_pos(45,"PB_MTC550SKYWAVE_REDUCED_POSITION"),
	qpid_st_pb_idp780_extended_log(46,"PB_IDP780_EXTENDED_LOG"),
	qpid_st_pb_idp780_iccid(47,"PB_IDP780_ICCID"),
	qpid_st_pb_idp780skywave_iccid(48,"PB_IDP780SKYWAVE_ICCID"),
	qpid_st_pb_idp780_files_list(49,"PB_IDP780_FILES_LIST"),
	qpid_st_pb_idp780skywave_files_list(50,"PB_IDP780SKYWAVE_FILES_LIST"),
	qpid_st_pb_mxt1xx_transparent_response(51,"PB_MXT1XX_TRANSPARENT_RESPONSE"),
	qpid_st_pb_mtc550_presentation(52,"PB_MTC550_PRESENTATION"),
	qpid_st_pb_idp780_presentation(53,"PB_IDP780_PRESENTATION"),
	qpid_st_pb_idp780_hw_info(54,"PB_IDP780_HW_INFO"),
	qpid_st_pb_mxt1xx_keep_alive(55,"MXT1XX_KEEP_ALIVE"),
	qpid_st_pb_idp780skywave_hw_info(56,"PB_IDP780SKYWAVE_HW_INFO"),
	qpid_st_pb_idp780_black_box_info(57,"PB_IDP780_BLACK_BOX_INFO"),
	qpid_st_pb_mxt1xx_request_old_pos_sts(58,"PB_MXT1XX_REQUEST_OLD_POS_STS"),
	qpid_st_pb_mtc550_black_box_info(59,"PB_MTC550_BLACK_BOX_INFO"),
	qpid_st_pb_mxt1xx_device_information(60,"PB_MXT1XX_DEVICE_INFORMATION"),
	qpid_st_pb_mxt1xx_dynamic_setup(61,"PB_MXT1XX_DYNAMIC_SETUP");
	
	private final int subjectCode;
	private final String subjectDescription;

	private QpidTypes(int subjectCode, String subjectDescription) {
		this.subjectCode = subjectCode;
		this.subjectDescription = subjectDescription;
	}

	public int getSubjectCode() {
		return subjectCode;
	}

	public String getSubjectDescription() {
		return subjectDescription;
	}

	public static QpidTypes valueOfBySubjectDescription(String description) {
		for (QpidTypes type : values()) {
			if (type.getSubjectDescription().equals(description)) {
				return type;
			}
		}
		return null;
	}

	public static QpidTypes valueOfBySubjectCode(int subjectCode) {
		for (QpidTypes type : values()) {
			if (type.getSubjectCode() == subjectCode) {
				return type;
			}
		}
		return null;
	}
}