package com.ocdsoft.bacta.swg.server.game.message.object;

import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;

public enum GameControllerMessageType {
    NOTHING(0),
    CAMERA_YAW(1),
    CAMERA_PITCH(2),
    MOVE_PLAYER(3),
    TOGGLE_LIGHT(4),
    UI_CHAT_COLLAPSE(5),
    UI_CHAT_ICONIFY(6),
    UI_CHAT_MAXIMIZE(7),
    UI_CHAT_TAB_EDIT(8),
    UI_CHAT_TAB_KILL(9),
    UI_CHAT_TAB_NEW(10),
    UI_CHAT_TAB_NEXT(11),
    UI_CHAT_TAB_PREV(12),
    UI_COMBAT_AIM(13),
    UI_COMBAT_ATTACK(14),
    UI_COMBAT_TARGET(15),
    UI_POSTURE0(16),
    UI_POSTURE1(17),
    UI_POSTURE2(18),
    UI_ATTITUDE0(19),
    UI_ATTITUDE1(20),
    UI_ATTITUDE2(21),
    UI_ATTITUDE3(22),
    UI_ATTITUDE4(23),
    UI_CONVERSATION_RESPONSE0(24),
    UI_CONVERSATION_RESPONSE1(25),
    UI_CONVERSATION_RESPONSE2(26),
    UI_CONVERSATION_RESPONSE3(27),
    UI_CONVERSATION_RESPONSE4(28),
    UI_CONVERSATION_RESPONSE5(29),
    UI_CONVERSATION_START(30),
    UI_CONVERSATION_STOP(31),
    UI_DEBUG_PRINT(32),
    UI_GAME_MENU_ACTIVATE(33),
    UI_INVENTORY_CLOSE(34),
    UI_INVENTORY_ICONIFY(35),
    UI_INVENTORY_MAXIMIZE(36),
    UI_MFD_ICONIFY(37),
    UI_MFD_MAXIMIZE(38),
    UI_MFD_NEXT(39),
    UI_MFD_PREV(40),
    UI_MISSION_BROWSER(41),
    UI_MISSION_CREATION(42),
    UI_POINTER_TOGGLE_DOWN(43),
    UI_POINTER_TOGGLE_UP(44),
    UI_RADAR_ICONIFY(45),
    UI_RADAR_MAXIMIZE(46),
    UI_RADAR_RANGE_DECREASE(47),
    UI_RADAR_RANGE_INCREASE(48),
    UI_RADAR_UPDATE(49),
    UI_SKILLS(50),
    UI_DATA_STORAGE(51),
    UI_START_CHAT(52),
    UI_TARGETS_CLEAR_ALL(53),
    UI_TARGETS_CLEAR_SELECTED(54),
    UI_TARGETS_ICONIFY(55),
    UI_TARGETS_NEXT(56),
    UI_TARGETS_PEACE_ATTACK_TOGGLE(57),
    UI_TARGETS_PREV(58),
    UI_TOGGLE_CHAT_BUBBLES_MINIMIZED(59),
    UI_TOGGLE_HUD(60),
    UI_TOOLBAR_PANE_NEXT(61),
    UI_TOOLBAR_PANE_PREV(62),
    UI_TOOLBAR_SLOT0(63),
    UI_TOOLBAR_SLOT1(64),
    UI_TOOLBAR_SLOT2(65),
    UI_TOOLBAR_SLOT3(66),
    UI_TOOLBAR_SLOT4(67),
    UI_TOOLBAR_SLOT5(68),
    UI_TOOLBAR_SLOT6(69),
    UI_TOOLBAR_SLOT7(70),
    UI_TOOLBAR_SLOT8(71),
    UI_TOOLBAR_SLOT9(72),
    UI_TOOLBAR_SLOT10(73),
    UI_TOOLBAR_SLOT11(74),
    UI_PERSISTENT_MESSAGE_BROWSER(75),
    UI_CHAT_ROOM_BROWSER(76),
    UI_WORKSPACE_FRAME_CLOSE(77),
    UI_WORKSPACE_FRAME_ICONIFY(78),
    UI_WORKSPACE_FRAME_MAXIMIZE(79),
    UI_WORKSPACE_FRAME_NEXT(80),
    UI_WORKSPACE_FRAME_PREV(81),
    LEFT(82),
    RIGHT(83),
    UP(84),
    DOWN(85),
    BUTTON_DEPRECATED(86),
    YAW(87),
    PITCH(88),
    ROLL(89),
    CAMERA_YAW_MOUSE(90),
    CAMERA_PITCH_MOUSE(91),
    CAMERA_ZOOM(92),
    CAMERA_LOCK(93),
    CAMERA_RESET(94),
    EXIT(95),
    COCKPIT_CAMERA(96),
    CHASE_CAMERA(97),
    OBJECT_CAMERA(98),
    SPIN_CAMERA(99),
    FLYBY_CAMERA(100),
    TRACK_CAMERA(101),
    INCREASE(102),
    DECREASE(103),
    FULL_SPEED(104),
    FULL_STOP(105),
    ALT(106),
    SHIFT(107),
    FIRE_GUN(108),
    TOGGLE_GUN(109),
    CAMERA_RESET_CURSOR(110),
    CYCLE_TARGETS(111),
    NET_SPAWN(112),
    NET_UPDATE_TRANSFORM(113),
    NET_FRAG(114),
    NET_DEATH(115),
    NET_SHOOT(116),
    NET_MOVE(117),
    NET_CHAT(118),
    NET_DISCONNECT(119),
    HEAD_CAMERA(120),
    TOGGLE_SHIP_STATE(121),
    SET_TRANSFORM1(122),
    IDLE(123),
    WALK(124),
    FREE_CAMERA(125),
    WEAR(126),
    SET_TRANSFORM2(127),
    RUN(128),
    ANIMATION_STATE_IDLE(129),
    ANIMATION_STATE_WALK(130),
    ANIMATION_STATE_RUN(131),
    SET_MEMBER_DATA(132),
    APPLY_DELTA(133),
    SWOOP_CAMERA(134),
    SET_YAW(135),
    TURN(136),
    ENVIRONMENT_PAUSE(137),
    TERRAIN_SHOW_LOD_BORDER_CHUNKS(138),
    TERRAIN_FREEZE(139),
    TOGGLE_ENVIRONMENT(140),
    TOGGLE_OCCLUSION(141),
    UMBRA_EXPORT_FALSE(142),
    UMBRA_EXPORT_TRUE(143),
    TERRAIN_TOGGLE_HEIGHT_BIAS(144),
    TERRAIN_SHOW_LOD(145),
    TERRAIN_MULTITHREADED(146),
    FILL_MODE(147),
    BUILDING_INCREASE_DESIRED_LEVEL(148),
    BUILDING_DECREASE_DESIRED_LEVEL(149),
    PAUSE(150),
    PANORAMA(151),
    SCREEN_SHOT360(152),
    TOGGLE_RUN_ON(153),
    TOGGLE_RUN_OFF(154),
    MOVE_LONGITUDINAL(155),
    MOVE_LATERAL(156),
    TOGGLE_STRAFE(157),
    CAMERA_PIVOT_YAW(158),
    CAMERA_PIVOT_PITCH(159),
    CAMERA_PIVOT_TRANSLATE_X(160),
    CAMERA_PIVOT_TRANSLATE_Y(161),
    CAMERA_PIVOT_ZOOM(162),
    CAMERA_TRANSLATE_X(163),
    CAMERA_TRANSLATE_Y(164),
    CAMERA_TRANSLATE_Z(165),
    FREE_CHASE_CAMERA(166),
    MOUSE_WHEEL(167),
    CAMERA_SMARTS(168),
    CAMERA_SMARTS_ABOVE4_METERS(169),
    CAMERA_SWOOP_IN(170),
    CAMERA_DOORWAY(171),
    EMOTE1(172),
    EMOTE2(173),
    EMOTE3(174),
    EMOTE4(175),
    EMOTE5(176),
    EMOTE6(177),
    EMOTE7(178),
    EMOTE8(179),
    EMOTE9(180),
    EMOTE10(181),
    CYCLE_RUN_ANIMATION(182),
    CYCLE_RUN_ANIMATION_BACKWARD(183),
    CYCLE_WALK_ANIMATION(184),
    CYCLE_WALK_ANIMATION_BACKWARD(185),
    ANIMATION_STATE_RUN2(186),
    ANIMATION_STATE_RUN3(187),
    ANIMATION_STATE_RUN4(188),
    ANIMATION_STATE_RUN5(189),
    ANIMATION_STATE_RUN6(190),
    ANIMATION_STATE_RUN7(191),
    ANIMATION_STATE_RUN8(192),
    ANIMATION_STATE_RUN9(193),
    ANIMATION_STATE_RUN10(194),
    ANIMATION_STATE_WALK2(195),
    ANIMATION_STATE_WALK3(196),
    ANIMATION_STATE_WALK4(197),
    ANIMATION_STATE_WALK5(198),
    ANIMATION_STATE_WALK6(199),
    ANIMATION_STATE_WALK7(200),
    ANIMATION_STATE_WALK8(201),
    ANIMATION_STATE_WALK9(202),
    ANIMATION_STATE_WALK10(203),
    COMBAT_ACTION(204),
    COMBAT_DAMAGE(205),
    COMBAT_DAMAGE_LIST(206),
    WARP_PLAYER_TO_FREE_CAMERA(207),
    RESOURCE_ADD(208),
    ACTIVATE_INSTALLATION(209),
    RESOURCE_POOL_ADD_HARVESTER(210),
    RESOURCE_SET_INSTALLED_EFFICIENCY(211),
    INSTALLATION_HARVEST(212),
    RESOURCE_POOL_COLLECT_RESOURCE(213),
    RESOURCE_FINISH_HARVEST(214),
    DEACTIVATE_INSTALLATION(215),
    RESOURCE_POOL_REMOVE_HARVESTER(216),
    RESOURCE_POOL_DEPLETED(217),
    RESOURCE_TYPE_DEPLETED(218),
    RESOURCE_SPAWN_POOL(219),
    RESOURCE_EMPTY_HOPPER(220),
    NPC_CONVERSATION_START(221),
    NPC_CONVERSATION_STOP(222),
    NPC_CONVERSATION_MESSAGE(223),
    NPC_CONVERSATION_RESPONSES(224),
    NPC_CONVERSATION_SELECT(225),
    TRANSFER_ITEM(226),
    OPPONENT_INFO(227),
    DEBUG_PORTAL_CAMERA(228),
    CLIENT_RESOURCE_HARVESTER_ACTIVATE(229),
    CLIENT_RESOURCE_HARVESTER_DEACTIVATE(230),
    CLIENT_RESOURCE_HARVESTER_LISTEN(231),
    CLIENT_RESOURCE_HARVESTER_STOP_LISTENING(232),
    CLIENT_RESOURCE_HARVESTER_GET_RESOURCE_DATA(233),
    CLIENT_RESOURCE_HARVESTER_RESOURCE_DATA(234),
    CLIENT_RESOURCE_HARVESTER_RESOURCE_SELECT(235),
    CLIENT_RESOURCE_HARVESTER_SURVEY(236),
    CLIENT_RESOURCE_HARVESTER_EMPTY_HOPPER(237),
    CLIENT_RESOURCE_HARVESTER_EMPTY_HOPPER_RESPONSE(238),
    CLIENT_OBJECT_MENU_REQUEST(239),
    CLIENT_OBJECT_MENU_SELECT(240),
    NET_UPDATE_TRANSFORM_WITH_PARENT(241),
    ANIMATION_ACTION(242),
    SPATIAL_CHAT_SEND(243),
    SPATIAL_CHAT_RECEIVE(244),
    MISSION_LIST_REQUEST(245),
    MISSION_LIST_RESPONSE(246),
    MISSION_DETAILS_REQUEST(247),
    MISSION_DETAILS_RESPONSE(248),
    MISSION_ACCEPT_REQUEST(249),
    MISSION_ACCEPT_RESPONSE(250),
    MISSION_REMOVE_REQUEST(251),
    MISSION_REMOVE_RESPONSE(252),
    MISSION_POST_REQUEST(253),
    MISSION_POST_RESPONSE(254),
    MISSION_CREATE_REQUEST(255),
    MISSION_CREATE_RESPONSE(256),
    SERVER_MISSION_ASSIGN(257),
    DRAFT_SCHEMATICS_MESSAGE(258),
    DRAFT_SLOTS_MESSAGE(259),
    SCHEMATIC_ATTRIBS_MESSAGE(260),
    INGREDIENTS_HOPPER_MESSAGE(261),
    EXPERIMENT_MESSAGE(262),
    FILL_SCHEMATIC_SLOT_MESSAGE(263),
    EMPTY_SCHEMATIC_SLOT_MESSAGE(264),
    NEXT_CRAFTING_STAGE(265),
    CREATE_PROTOTYPE(266),
    CREATE_MANF_SCHEMATIC(267),
    CRAFTING_RESULT(268),
    NEXT_STAGE_READY(269),
    SELECT_DRAFT_SCHEMATIC(270),
    REQUEST_CRAFTING_SESSION(271),
    CANCEL_CRAFTING_SESSION(272),
    RESTART_CRAFTING_SESSION(273),
    SCHEMATIC_CUSTOMIZATIONS_MESSAGE(274),
    EXPERIMENT_RESULT(275),
    GET_TOKEN_FOR_OBJECT(276),
    SECURE_TRADE(277),
    COMMAND_QUEUE_ENQUEUE(278),
    COMMAND_QUEUE_REMOVE(279),
    COMMAND_QUEUE_ENQUEUE_FWD(280),
    COMMAND_QUEUE_ALTER_WAIT_TIMER_FWD(281),
    COMMAND_QUEUE_FORCE_EXECUTE_COMMAND_FWD(282),
    PVP_MESSAGE(283),
    GET_WAYPOINT_FOR_OBJECT(284),
    UI_PERSISTENT_MESSAGE_COMPOSER(285),
    UI_CHAT_ROOMS(286),
    UI_SKILL_COMMANDS(287),
    UI_CHARACTER_SHEET(288),
    CAMERA_PATH_NORMAL(289),
    CAMERA_PATH_ADD_WAYPOINT(290),
    CAMERA_PATH_PLAYBACK(291),
    CAMERA_PATH_DELETE_LAST_WAYPOINT(292),
    SCRIPT_TRIGGER(293),
    CLIENT_LOOK_AT_TARGET(294),
    COMBAT_AIM_TO_CLIENT(295),
    VTUNE_RESUME(296),
    VTUNE_PAUSE(297),
    VTUNE_COUNTER(298),
    SYNCHRONIZE_SCRIPT_VARS(299),
    CLIENT_MOOD_CHANGE(300),
    TRANSFER_OBJECT_TO_CELL(301),
    SOCIAL_RECEIVE(302),
    SOCIAL_SEND(303),
    UI_CHAT_TAB(304),
    SET_POSTURE(305),
    UI_CLIENT_SOCIAL(306),
    UI_CLIENT_MOOD(307),
    COMBAT_SPAM(308),
    UI_CYCLE_TARGET_INWARD(309),
    UI_CYCLE_TARGET_OUTWARD(310),
    UI_CYCLE_TARGET_NEXT(311),
    UI_CYCLE_TARGET_PREV(312),
    ATTACH_SCRIPT(313),
    DETACH_SCRIPT(314),
    SIT_ON_OBJECT(315),
    UI_COMBAT_QUEUE_COLLAPSE(316),
    UI_COMBAT_QUEUE_EXPAND(317),
    TELEPORT(318),
    TELEPORT_ACK(319),
    WEAPON_RANGES_MESSAGE(320),
    UI_MISSION_DETAILS(321),
    MISSION_ABORT(322),
    SET_BUILDING_CITY_ID(323),
    CLIENT_COMMAND_PARSER(324),
    DEBUG_KEY_CONTEXT1(325),
    OBJECT_MENU_REQUEST(326),
    OBJECT_MENU_RESPONSE(327),
    SET_STATE(328),
    SET_ATTRIBUTE(329),
    SET_MAX_ATTRIBUTE(330),
    SET_MENTAL_STATE(331),
    SET_MENTAL_STATE_TOWARD(332),
    SET_COVER(333),
    SET_MENTAL_STATE_TOWARD_CLAMP_BEHAVIOR(334),
    SET_MAX_MENTAL_STATE(335),
    SET_MENTAL_STATE_DECAY(336),
    SET_LOCOMOTION(337),
    SET_AUTO_ATTACK(338),
    SET_OWNER_ID(339),
    SET_MAX_HIT_POINTS(340),
    SET_VISIBLE(341),
    SET_INVULNERABLE(342),
    SET_COMBAT_ATTITUDE(343),
    ADD_PLAYER_TO_SPAWN_QUEUE(344),
    REMOVE_PLAYER_FROM_SPAWN_QUEUE(345),
    SET_CUSTOMIZATION_DATA(346),
    GROUP_SET_NAME(347),
    GROUP_ADD_MEMBER(348),
    GROUP_REMOVE_MEMBER(349),
    GROUP_DISBAND(350),
    SET_GROUP_INVITER(351),
    SET_PERFORMANCE_TYPE(352),
    SET_PERFORMANCE_LISTEN_TARGET(353),
    SET_PERFORMANCE_WATCH_TARGET(354),
    UI_SURVEY(355),
    SET_PERFORMANCE_START_TIME(356),
    FORWARD_NPC_CONVERSATION_MESSAGE(357),
    MUSIC_FLOURISH(358),
    COMMAND_QUEUE_ADD(359),
    ADD_NPC_CONVERSATION_RESPONSE(360),
    REMOVE_NPC_CONVERSATION_RESPONSE(361),
    SEND_NPC_CONVERSATION_RESPONSES(362),
    PLAYER_RESPONSE_TO_NPC_CONVERSATION(363),
    SCRIPT_TRANSFER_MONEY(364),
    GROUP_MAKE_LEADER(365),
    PERSIST_OBJECT(366),
    SET_CACHE_VERSION(367),
    SET_OBJECT_NAME(368),
    SET_OBJECT_NAME_STRING_ID(369),
    TELEPORT_OBJECT(370),
    UPDATE_POSITION_ON_PLANET_SERVER(371),
    SET_PLAYER_CONTROLLED(372),
    CUSTOMIZE(373),
    PERMANENTLY_DESTROY(374),
    TRANSFER_AUTHORITY(375),
    ADD_LOCATION_TARGET(376),
    REMOVE_LOCATION_TARGET(377),
    ADD_LOCATION_EXIT_TARGET(378),
    REMOVE_LOCATION_EXIT_TARGET(379),
    SET_BUILDING_IS_PUBLIC(380),
    SET_IN_COMBAT(381),
    ADD_AIM(382),
    CLEAR_AIMS(383),
    ALTER_HIT_POINTS(384),
    ADD_RESOURCE(385),
    SET_COMBAT_TARGET(386),
    REMOVE_COMBAT_TARGET(387),
    SET_CRAFTED_ID(388),
    START_CRAFTING_SESSION(389),
    STOP_CRAFTING_SESSION(390),
    ADD_INGREDIENT_TO_HOPPER(391),
    REMOVE_INGREDIENT_FROM_HOPPER(392),
    ADD_OBJECT_TO_OUTPUT_SLOT(393),
    SET_CRAFTING_MANUFACTURE_SCHEMATIC(394),
    CLEAR_CRAFTING_MANUFACTURE_SCHEMATIC(395),
    SET_CRAFTING_PROTOTYPE(396),
    CLEAR_CRAFTING_PROTOTYPE(397),
    SET_VISIBLE_COMPONENTS(398),
    SET_IS_SHIELD(399),
    RESOURCE_POOL_DEDUCT_RESOURCE(400),
    DEBUG_KEY_CONTEXT2(401),
    SET_AMMO(402),
    ADD_ALLOWED(403),
    REMOVE_ALLOWED(404),
    ADD_BANNED(405),
    REMOVE_BANNED(406),
    SET_DEFAULT_WEAPON(407),
    SET_MOD_VALUE(408),
    GRANT_COMMAND(409),
    GRANT_EXPERIENCE_POINTS(410),
    GRANT_SKILL(411),
    REVOKE_COMMAND(412),
    REVOKE_SKILL(413),
    ALTER_ATTRIBUTE(414),
    ADD_ATTRIBUTE_MODIFIER(415),
    REMOVE_ATTRIBUTE_MODIFIERS(416),
    REMOVE_ALL_ATTRIBUTE_MODIFIERS(417),
    APPLY_DAMAGE_TO_ARMOR(418),
    SET_COMBAT_TARGETS(419),
    SET_CURRENT_WEAPON(420),
    SET_GROUP(421),
    SET_MOOD(422),
    SET_INCAPACITATED(423),
    SET_SAY_MODE(424),
    SET_ANIMATION_MOOD(425),
    SET_SCALE_FACTOR(426),
    SET_SHOCK_WOUNDS(427),
    SET_LOOK_AT_TARGET(428),
    SET_MOVEMENT_STATIONARY(429),
    SET_MOVEMENT_WALK(430),
    SET_MOVEMENT_RUN(431),
    SET_SLOPE_MOD_ANGLE(432),
    SET_SLOPE_MOD_PERCENT(433),
    SET_WATER_MOD_PERCENT(434),
    SET_MOVEMENT_PERCENT(435),
    SET_TURN_PERCENT(436),
    SET_ACCEL_PERCENT(437),
    PLANET_ADD_TRAVEL_POINT(438),
    PLANET_REMOVE_TRAVEL_POINT(439),
    PLANET_TRAVEL_POINT_NAMES_REQUEST(440),
    PLANET_TRAVEL_POINT_NAMES_RESPONSE(441),
    FACTORY_ADD_OBJECT(442),
    ADD_SCHEMATIC(443),
    MANUFACTURE_INSTALLATION_CREATE_OBJECT(444),
    SHOW_FLY_TEXT(445),
    NEXT_CRAFTING_STAGE_RESULT(446),
    DRAFT_SLOTS_QUERY_RESPONSE(447),
    SET_BATTLEFIELD_PARTICIPANT(448),
    CLEAR_BATTLEFIELD_PARTICIPANTS(449),
    CRAFTING_SESSION_ENDED(450),
    SET_INT_DYNAMIC_VARIABLE(451),
    SET_INT_ARRAY_DYNAMIC_VARIABLE(452),
    SET_FLOAT_DYNAMIC_VARIABLE(453),
    SET_FLOAT_ARRAY_DYNAMIC_VARIABLE(454),
    SET_STRING_DYNAMIC_VARIABLE(455),
    SET_STRING_ARRAY_DYNAMIC_VARIABLE(456),
    SET_OBJ_ID_DYNAMIC_VARIABLE(457),
    SET_OBJ_ID_ARRAY_DYNAMIC_VARIABLE(458),
    SET_LOCATION_DYNAMIC_VARIABLE(459),
    SET_STRING_ID_DYNAMIC_VARIABLE(460),
    SET_STRING_ID_ARRAY_DYNAMIC_VARIABLE(461),
    COPY_DYNAMIC_VARIABLE(462),
    COPY_DYNAMIC_VARIABLE_TO_SUB_LIST(463),
    ADD_NESTED_OBJ_VAR_LIST(464),
    REMOVE_OBJ_VAR_ITEM(465),
    ERASE_OBJ_VAR_LIST_ENTRIES(466),
    SET_OBJ_VAR_ITEM_VAR(467),
    GUILD_CREATE(468),
    GUILD_REMOVE_MEMBER(469),
    GUILD_SET_MEMBER_PROFESSION_INFO(470),
    GUILD_REMOVE_ENEMY(471),
    GUILD_SET_ENEMY(472),
    GUILD_DISBAND(473),
    GUILD_SET_LEADER(474),
    BIOGRAPHY_RETRIEVED(475),
    SET_LOCATION_ARRAY_DYNAMIC_VARIABLE(476),
    GUILD_SET_NAME(477),
    GUILD_SET_ABBREV(478),
    REPLACE_ME1(479),
    REPLACE_ME2(480),
    REPLACE_ME3(481),
    REPLACE_ME4(482),
    REPLACE_ME5(483),
    REPLACE_ME6(484),
    REPLACE_ME7(485),
    REPLACE_ME8(486),
    CHARACTER_MATCH_RETRIEVED(487),
    INIT_DECAY(488),
    SET_DECAY(489),
    SET_VOLUME(490),
    SET_MASTER_ID(491),
    SET_CREATOR_ID(492),
    SET_CREATOR_NAME(493),
    SET_CREATOR_XP(494),
    SET_CREATOR_XP_TYPE(495),
    SET_CRAFTED_TYPE(496),
    RADAR_ZOOM(497),
    AUTO_RUN(498),
    RADAR_MAP(499),
    SET_FORCE_POWER(500),
    SET_MAX_FORCE_POWER(501),
    SET_WEATHER(502),
    ADD_JEDI(503),
    REMOVE_JEDI(504),
    UPDATE_JEDI(505),
    REQUEST_JEDI_BOUNTY(506),
    REMOVE_JEDI_BOUNTY(507),
    STARTING_LOCATIONS(508),
    STARTING_LOCATION_SELECTION_RESULT(509),
    SYNCHRONIZE_SCRIPT_VAR_DELTAS(510),
    MOUSE_WALK_START(511),
    MOUSE_WALK(512),
    CANCEL_AUTO_RUN(513),
    DIRECT_DAMAGE(514),
    SET_MOVEMENT_SCALE(515),
    SET_ACCEL_SCALE(516),
    DISCONNECT(517),
    TELEPORT_NEXT_FRAME(518),
    RESOURCE_WEIGHTS(519),
    SERVER_ADD_PLANET_MAP_LOCATION(520),
    SERVER_REMOVE_PLANET_MAP_LOCATION(521),
    SET_CONDITION(522),
    CLEAR_CONDITION(523),
    SET_HOUSE(524),
    SET_GROUP_MEMBER_DIFFICULTY(525),
    SET_DIFFICULTY(526),
    GRANT_OFFLINE_XP(527),
    CITY_CREATE(528),
    CITY_SET_NAME(529),
    CITY_REMOVE(530),
    CITY_SET_CITIZEN(531),
    CITY_REMOVE_CITIZEN(532),
    CITY_SET_STRUCTURE(533),
    CITY_REMOVE_STRUCTURE(534),
    SET_FORCE_REGEN_RATE(535),
    UPDATE_JEDI_LOCATION(536),
    SET_JEDI_OFFLINE(537),
    CREATURE_SET_BASE_WALK_SPEED(538),
    CREATURE_SET_BASE_RUN_SPEED(539),
    EMERGENCY_DISMOUNT_FOR_RIDER(540),
    DETACH_RIDER_FOR_MOUNT(541),
    SET_DECAY_TIME(542),
    CLEAR_DECAY_TIME(543),
    CITY_SET_CITY_HALL(544),
    CITY_SET_LOCATION(545),
    CITY_SET_RADIUS(546),
    CITY_SET_LEADER(547),
    CITY_SET_INCOME_TAX(548),
    CITY_SET_PROPERTY_TAX(549),
    CITY_SET_SALES_TAX(550),
    CITY_SET_TRAVEL_INFO(551),
    CITY_SET_CLONE_INFO(552),
    MOD_DATA(553),
    CANCEL_MOD(554),
    OBJECT_MENU_DIRTY(555),
    ATTRIBUTES_DIRTY(556),
    SET_TRANSFORM_DYNAMIC_VARIABLE(557),
    SET_TRANSFORM_ARRAY_DYNAMIC_VARIABLE(558),
    SET_VECTOR_DYNAMIC_VARIABLE(559),
    SET_VECTOR_ARRAY_DYNAMIC_VARIABLE(560),
    AI_SET_MOVEMENT(561),
    AI_SET_MOVEMENT_WALK(562),
    UPDATE_JEDI_BOUNTIES(563),
    SET_APPEARANCE_FROM_OBJECT_TEMPLATE(564),
    AI_SET_MOVEMENT_RUN(565),
    APPLY_WOUND(566),
    SET_WOUND(567),
    IMAGE_DESIGNER_CHANGE(568),
    IMAGE_DESIGNER_CANCEL(569),
    IMAGE_DESIGNER_START(570),
    SET_JEDI_STATE(571),
    UPDATE_JEDI_STATE(572),
    MAKE_DEAD(573),
    UPDATE_JEDI_SPENT_JEDI_SKILL_POINTS(574),
    UPDATE_JEDI_SCRIPT_DATA(575),
    REMOVE_JEDI_SCRIPT_DATA(576),
    REMOVE_ALL_JEDI_BOUNTIES(577),
    UPDATE_JEDI_FACTION(578),
    SET_CURRENT_QUEST(579),
    SET_REGEN_RATE(580),
    UPDATE_OBSERVERS_COUNT(581),
    HIDE_FROM_CLIENT(582),
    SET_HIBERNATION_DELAY(583),
    SET_ATTACKABLE_OVERRIDE(584),
    MODIFY_CURRENT_GCW_POINTS(585),
    MODIFY_CURRENT_GCW_RATING(586),
    MODIFY_CURRENT_PVP_KILLS(587),
    MODIFY_LIFETIME_GCW_POINTS(588),
    MODIFY_MAX_GCW_IMPERIAL_RATING(589),
    MODIFY_MAX_GCW_REBEL_RATING(590),
    MODIFY_LIFETIME_PVP_KILLS(591),
    MODIFY_NEXT_GCW_RATING_CALC_TIME(592),
    CANCEL_MESSAGE_TO(593),
    CLEAR_SESSION_ACTIVITY(594),
    ADD_SESSION_ACTIVITY(595),
    ADD_PASSIVE_REVEAL(596),
    REMOVE_PASSIVE_REVEAL(597),
    REMOVE_ALL_PASSIVE_REVEAL(598),
    MODIFY_HOLOGRAM_TYPE(599),
    MODIFY_VISIBLE_ON_MAP_AND_RADAR(600),
    SET_COVER_VISIBILITY(601),
    BUFF_BUILDER_CHANGE(602),
    BUFF_BUILDER_CANCEL(603),
    BUFF_BUILDER_START(604),
    INCUBATOR_START(605),
    INCUBATOR_COMMIT(606),
    INCUBATOR_CANCEL(607),
    MODIFY_COLLECTION_SLOT_VALUE(608),
    REMOVE_COLLECTION(609),
    ADJUST_LOT_COUNT(610),
    SQUELCH(611),
    UNSQUELCH(612),
    SET_PRIVILEDGED_TITLE(613),
    COLLECTION_REQUEST_SERVER_FIRST(614),
    COLLECTION_REVOKE_SERVER_FIRST(615),
    ADD_HATE_OVER_TIME(616),
    SET_CONNECTED_CHARACTER_LFG_DATA(617),
    REMOVE_CONNECTED_CHARACTER_DATA(618),
    SET_CONNECTED_CHARACTER_GROUP_DATA(619),
    SET_CONNECTED_CHARACTER_PLANET_DATA(620),
    SET_CONNECTED_CHARACTER_BIOGRAPHY_DATA(621),
    REMOVE_CONNECTED_CHARACTER_BIOGRAPHY_DATA(622),
    SET_GROUP_MEMBER_PROFESSION(623),
    SET_CONNECTED_CHARACTER_LEVEL_DATA(624),
    SET_CONNECTED_CHARACTER_PROFESSION_DATA(625),
    SET_CONNECTED_CHARACTER_ANONYMOUS_DATA(626),
    SET_CONNECTED_CHARACTER_INTERESTS_DATA(627),
    SET_CONNECTED_CHARACTER_REGION_DATA(628),
    SET_GROUP_PICKUP_TIMER(629),
    SET_GROUP_PICKUP_LOCATION(630),
    SET_CONNECTED_CHARACTER_DISPLAY_LOCATION_IN_SEARCH_RESULTS_DATA(631),
    SET_CONNECTED_CHARACTER_PLAYER_CITY_DATA(632),
    ADD_UNIVERSE_EVENT(633),
    REMOVE_UNIVERSE_EVENT(634),
    SET_CONNECTED_CHARACTER_SEARCHABLE_BY_CTS_SOURCE_GALAXY_DATA(635),
    FORCE_HATE_TARGET(636),
    ADD_USER_TO_ACCESS_LIST(637),
    REMOVE_USER_FROM_ACCESS_LIST(638),
    CLEAR_USER_ACCESS_LIST(639),
    GUILD_UPDATE_GUILD_WAR_KILL_TRACKING_DATA(640),
    GUILD_SET_GUILD_ELECTION_END_TIME(641),
    GUILD_ADD_MEMBER_RANK(642),
    GUILD_REMOVE_MEMBER_RANK(643),
    GUILD_ADD_CREATOR_MEMBER(644),
    GUILD_ADD_SPONSOR_MEMBER(645),
    GUILD_SET_MEMBER_PERMISSION(646),
    GUILD_SET_MEMBER_TITLE(647),
    GUILD_SET_MEMBER_ALLEGIANCE(648),
    GUILD_SET_MEMBER_PERMISSION_AND_ALLEGIANCE(649),
    GUILD_SET_MEMBER_NAME_AND_PERMISSION(650),
    CITY_SET_CREATION_TIME(651),
    ADJUST_GCW_IMPERIAL_SCORE(652),
    ADJUST_GCW_REBEL_SCORE(653),
    CITY_SET_CITIZEN_PROFESSION_INFO(654),
    CITY_SET_CITIZEN_ADD_RANK(655),
    CITY_SET_CITIZEN_REMOVE_RANK(656),
    CITY_SET_CITIZEN_TITLE(657),
    ADJUST_PGC_RATING(658),
    ADJUST_PGC_RATING_DATA(659),
    SET_PGC_RATING_DATA(660),
    FIX_PGC_CHRONICLER_NAME(661),
    CITY_SET_FACTION(662),
    GUILD_SET_GUILD_FACTION(663),
    GUILD_SET_GUILD_GCW_DEFENDER_REGION(664),
    CITY_SET_GCW_DEFENDER_REGION(665),
    FORM_DATA_FOR_EDIT(1000),
    SHIP_DYNAMICS_YAW(1001),
    SHIP_DYNAMICS_PITCH(1002),
    SHIP_DYNAMICS_ROLL(1003),
    SHIP_FIRE_WEAPON_ALL(1004),
    SHIP_FIRE_WEAPON0(1005),
    SHIP_FIRE_WEAPON1(1006),
    SHIP_FIRE_WEAPON2(1007),
    SHIP_FIRE_WEAPON3(1008),
    SHIP_FIRE_WEAPON4(1009),
    SHIP_FIRE_WEAPON5(1010),
    SHIP_FIRE_WEAPON6(1011),
    SHIP_FIRE_WEAPON7(1012),
    SHIP_DAMAGE_MESSAGE(1013),
    SERVER_ASTEROID_DEBUG_DATA(1014),
    COMM_PLAYER(1015),
    LIGHTNING_HIT_SHIP(1016),
    ENVIRONMENT_HIT_SHIP(1017),
    CLIENT_LOOK_AT_TARGET_COMPONENT(1018),
    UI_CYCLE_COMPONENT_TARGET_FORWARD(1019),
    UI_CYCLE_COMPONENT_TARGET_BACKWARD(1020),
    UPDATE_SHIP_ON_COLLISION(1021),
    ABOUT_TO_HYPERSPACE(1022),
    PLAYER_TRANSITIONING_OUT(1023),
    PLAYER_TRANSITIONING_IN(1024),
    UI_PLAY_EFFECT(1025),
    SHIP_THROTTLE_CHANGE_START(1026),
    SHIP_THROTTLE_CHANGE(1027),
    SHIP_THROTTLE_SET_SLIDER(1028),
    YAW_BUTTON(1029),
    PITCH_BUTTON(1030),
    ROLL_BUTTON(1031),
    SHIP_THROTTLE_SET_AXIS(1032),
    SPACE_TARGET_CLOSEST_SHIP(1033),
    SPACE_TARGET_CLOSEST_CAP_SHIP(1034),
    SPACE_TARGET_UNDER_RETICLE(1035),
    SPACE_TARGET_NEXT_FRIENDLY(1036),
    SPACE_TARGET_PREVIOUS_FRIENDLY(1037),
    SPACE_TARGET_NEXT_ENEMY(1038),
    SPACE_TARGET_PREVIOUS_ENEMY(1039),
    SET_GROUP_SHIP_FOR_MEMBER(1040),
    SET_GROUP_SHIP_FORMATION_SLOT_FOR_MEMBER(1041),
    ADD_IGNORE_INTERSECT(1042),
    REMOVE_IGNORE_INTERSECT(1043),
    SPACE_TARGET_NEXT_ON_SCREEN_UNDER_VARIABLE_RETICLE(1044),
    SPACE_TARGET_PREVIOUS_ON_SCREEN_UNDER_VARIABLE_RETICLE(1045),
    SPACE_TARGET_CLOSEST_PLAYER_SHIP(1046),
    SPACE_TARGET_CLOSEST_N_P_C_SHIP(1047),
    JOYSTICK_POV_DIRECTION(1048),
    JOYSTICK_POV_CENTER(1049),
    ADD_GROUP_P_O_B_SHIP_AND_OWNER(1050),
    REMOVE_GROUP_P_O_B_SHIP(1051),
    SPACE_TERMINAL_REQUEST(1052),
    SPACE_TERMINAL_RESPONSE(1053),
    SET_THROTTLE_POSITION(1054),
    SPACE_TARGET_LAST_ENEMY_THAT_SHOT_PLAYER(1055),
    SPACE_TARGET_CLOSEST_ENEMY(1056),
    SPACE_TARGET_CLOSEST_ENEMY_PLAYER(1057),
    SPACE_TARGET_CLOSEST_FRIEND(1058),
    SPACE_TARGET_CLOSEST_FRIEND_PLAYER(1059),
    SPACE_TARGET_NEXT_FRIENDLY_PLAYER(1060),
    SPACE_TARGET_PREVIOUS_FRIENDLY_PLAYER(1061),
    SPACE_TARGET_NEXT_ENEMY_PLAYER(1062),
    SPACE_TARGET_PREVIOUS_ENEMY_PLAYER(1063),
    SPACE_TARGET_GROUP_LEADER(1064),
    SPACE_TARGET_NEXT_GROUP_MEMBER(1065),
    SPACE_TARGET_PREVIOUS_GROUP_MEMBER(1066),
    SWAP_ROLL_YAW_AXES(1067),
    REAR_VIEW(1068),
    HYPERSPACE_ORIENT_SHIP_TO_POINT_AND_LOCK_PLAYER_INPUT(1069),
    LOCK_PLAYER_SHIP_INPUT_ON_CLIENT(1070),
    UNLOCK_PLAYER_SHIP_INPUT_ON_CLIENT(1071),
    SPACE_TARGET_NEXT(1072),
    SPACE_TARGET_PREVIOUS(1073),
    SET_SPECIAL_ABILITY(1074),
    SPACE_SHIP_HIT(1075),
    SHIP_THROTTLE_DELTA_AXIS(1076),
    SHIP_THROTTLE_DELTA_SLIDER(1077),
    DROID_COMMAND_PROGRAMMING(1078),
    INVITE_OTHER_GROUP_MEMBERS_TO_LAUNCH_INTO_SPACE(1079),
    ASK_GROUP_MEMBER_TO_LAUNCH_INTO_SPACE(1080),
    GROUP_MEMBER_INVITATION_TO_LAUNCH_INTO_SPACE_RESPONSE(1081),
    RELAY_GROUP_MEMBER_INVITATION_TO_LAUNCH_ANSWER(1082),
    GROUP_MAKE_LOOT_MASTER(1083),
    GROUP_SET_LOOT_RULE(1084),
    GROUP_OPEN_LOTTERY_WINDOW_ON_CLIENT(1085),
    GROUP_CLOSE_LOTTERY_WINDOW_ON_CLIENT(1086),
    GROUP_LOTTERY_WINDOW_HEARTBEAT(1087),
    GROUP_LOTTERY_WINDOW_CLOSE_RESULTS(1088),
    QUEST_TASK_COUNTER_DATA(1089),
    PUSH_CREATURE(1090),
    SET_BIO_LINK(1091),
    QUEST_TASK_TIMER_DATA(1092),
    SLOW_DOWN_EFFECT(1093),
    REMOVE_SLOW_DOWN_EFFECT(1094),
    REMOVE_SLOW_DOWN_EFFECT_PROXY(1095),
    COMMAND_TIMER(1096),
    ADD_HATE(1097),
    SET_HATE(1098),
    REMOVE_HATE_TARGET(1099),
    CLEAR_HATE_LIST(1100),
    CHANGE_ROLE_ICON_CHOICE(1101),
    AI_SET_CREATURE_NAME(1102),
    AI_CREATURE_STATE(1103),
    AI_SET_HOME_LOCATION(1104),
    SET_LEVEL(1105),
    RECALCULATE_LEVEL(1106),
    AI_SET_FROZEN(1107),
    AI_SET_RETREATING(1108),
    AI_SET_LOGGING(1109),
    AI_EQUIP_PRIMARY_WEAPON(1110),
    AI_EQUIP_SECONDARY_WEAPON(1111),
    AI_UN_EQUIP_WEAPONS(1112),
    AI_MARK_COMBAT_START_LOCATION(1113),
    SHOW_COMBAT_TEXT(1114),
    SET_CURRENT_WORKING_SKILL(1115),
    SET_PROFESSION_TEMPLATE(1116),
    RESET_HATE_TIMER(1117),
    AUTO_EXPIRE_HATE_LIST_TARGET_ENABLED(1118),
    SHIP_STOP_FIRING(1200),
    CYBERNETICS_OPEN(1201),
    CYBERNETICS_CHANGE_REQUEST(1202),
    CYBERNETICS_CHANGE_REQUEST_TO_N_P_C(1203),
    SPACE_MINING_SALE_OPEN(1204),
    DETACH_ALL_RIDERS_FOR_MOUNT(1205),
    SPACE_MINING_SALE_SELL_RESOURCE(1206),
    REQUEST_ACTIVATE_QUEST(1207),
    REQUEST_COMPLETE_QUEST(1208),
    REMOVE_ALL_ALLOWED(1209),
    REMOVE_ALL_BANNED(1210),
    STATIC_LOOT_ITEM_DATA(1211),
    SHOW_LOOT_BOX(1212),
    QUEST_TASK_LOCATION_DATA(1213),
    FORCE_ACTIVATE_QUEST(1214),
    JUMP(1215),
    PRIMARY_ATTACK(1216),
    SECONDARY_ATTACK(1217),
    PRIMARY_ACTION(1218),
    PRIMARY_ACTION_AND_ATTACK(1219),
    SET_INTENDED_TARGET(1220),
    CLIENT_INTENDED_TARGET(1221),
    TOGGLE_AUTO_AIM(1222),
    TOGGLE_REPEAT_PRIMARY_ATTACK(1223),
    SET_INTENDED_AND_SUMMON_RADIAL_MENU(1224),
    CUSTOMIZE_FINISHED(1225),
    OPEN_CUSTOMIZATION_WINDOW(1226),
    INCREMENT_KILL_METER(1227),
    UNTARGET_ONLY(1228),
    PET_TOOLBAR_SLOT0(1229),
    PET_TOOLBAR_SLOT1(1230),
    PET_TOOLBAR_SLOT2(1231),
    PET_TOOLBAR_SLOT3(1232),
    PET_TOOLBAR_SLOT4(1233),
    PET_TOOLBAR_SLOT5(1234),
    PET_TOOLBAR_SLOT6(1235),
    PET_TOOLBAR_SLOT7(1236),
    PET_TOOLBAR_SLOT8(1237),
    REMOVE_ALL_ATTRIBUTE_AND_SKILLMOD_MODIFIERS(1238),
    ADD_BUFF(1239),
    REMOVE_BUFF(1240),
    CLIENT_MINIGAME_OPEN(1241),
    CLIENT_MINIGAME_CLOSE(1242),
    CLIENT_MINIGAME_RESULT(1243),
    CREATE_SAGA(1244),
    OPEN_RATING_WINDOW(1245),
    RATING_FINISHED(1246),
    ABANDON_PLAYER_QUEST(1247),
    OPEN_RECIPE(1248),
    ADD_OBJECT_EFFECT(1249),
    REMOVE_OBJECT_EFFECT(1250),
    REMOVE_ALL_OBJECT_EFFECT(1251),
    LAST(1252);

    private static final TIntObjectMap<GameControllerMessageType> reverseLookup;

    static {
        final GameControllerMessageType[] types = values();
        reverseLookup = new TIntObjectHashMap<>(types.length);

        for (final GameControllerMessageType type : types)
            reverseLookup.put(type.value, type);
    }

    public final int value;

    GameControllerMessageType(final int value) {
        this.value = value;
    }

    public static GameControllerMessageType from(final int value) {
        final GameControllerMessageType type = reverseLookup.get(value);

        if (type == null)
            throw new ArrayIndexOutOfBoundsException(
                    String.format("No GameControllerMessageType could be found corresponding to the value %d", value));

        return type;
    }
}