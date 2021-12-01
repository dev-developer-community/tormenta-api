create table people (
	peo_id UUID,
	peo_name varchar(50) not null,
	peo_email varchar(50) not null,
	peo_password varchar(255) not null,
	created_at timestamp,
	updated_at timestamp,
	constraint pk_peo_id primary key(peo_id)
);

create table character (
	cha_id UUID,
	cha_name varchar(50),
	cha_breed varchar(50),
	cha_origin varchar(50),
	cha_class varchar(50),
	cha_level int,
	cha_god varchar(50),
	cha_total_life int,
	cha_total_mana int,
	cha_current_life int,
	cha_current_mana int,
	cha_displacement int,
	cha_exp_points int,
	cha_people_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_cha_id primary key(cha_id)
);

alter table character add constraint fk_character_people foreign key(cha_people_id) references people(peo_id);

create table item (
	ite_id integer,
	ite_description varchar(255),
	ite_magic_description varchar(255),
	ite_character_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_ite_id primary key(ite_id)
);

alter table item add constraint fk_item_character foreign key(ite_character_id) references character(cha_id);

create table magic (
	mag_id UUID,
	mag_description varchar(255),
	mag_character_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_mag_id primary key(mag_id)
);

alter table magic add constraint fk_magic_character foreign key(mag_character_id) references character(cha_id);

create table inventory (
	inv_id UUID,
	inv_description text,
	inv_character_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_inv_id primary key(inv_id)
);

alter table inventory add constraint fk_inventory_character foreign key(inv_personagem_id) references character(cha_id);

create table ability_breed_origin (
	abo_id UUID,
	abo_description text,
	abo_character_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_abo_id primary key(abo_id)
);

alter table ability_breed_origin add constraint fk_ability_breed_origin_character foreign key(abo_character_id) references character(cha_id);

create table annotation (
	ann_id UUID,
	ann_description text,
	ann_character_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_annotation_character primary key(ann_id)
);

alter table annotation add constraint fk_annotation_character foreign key(ann_character_id) references character(cha_id);

create table history (
	his_id UUID,
	his_description text,
	his_character_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_historico_personagem primary key(his_id)
);

alter table history add constraint fk_history_character foreign key(his_character_id) references character(cha_id);

create table attribute (
	att_id UUID,
	att_description varchar(255),
	created_at timestamp,
    updated_at timestamp,
	constraint pk_att_id primary key(att_id)
);

create table skill_character (
	skc_id UUID,
	skc_level_bonus int,
	skc_bonus_others int,
	skc_training_bonus int,
	skc_character_id UUID,
	skc_skill_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_skc_id primary key(skc_id)
);

create table skill_class_power (
    scp_id UUID,
    scp_description text,
    scp_character_id UUID,
    constraint pk_scp_id primary key(scp_id)
)

alter table skill_class_power add constraint fk_skill_class_power_character foreign key(scp_character_id) references character(cha_id);

create table skill (
	ski_id UUID,
	ski_attribute_id UUID,
	ski_description varchar(255),
	ski_training boolean,
	ski_punishment boolean,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_ski_id primary key(ski_id)
);

alter table skill add constraint fk_skill_attribute foreign key(ski_attribute_id) references skill(ski_id);
alter table skill_character add constraint fk_skill_character_character foreign key(skc_character_id) references character(cha_id);
alter table skill_character add constraint fk_skill_character_skill foreign key(skc_skill_id) references skill(ski_id);

create table character_attribute (
	cha_id UUID,
	cha_total int,
	cha_modifier int,
	cha_character_id UUID,
	cha_attribute_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_cha_id primary key(cha_id)
);

alter table character_attribute add constraint fk_character_attribute_charecter foreign key(cha_character_id) references character(cha_id);
alter table character_attribute add constraint fk_character_attribute_attribute foreign key(cha_attribute_id) references attribute(att_id);

create table attack (
	att_id UUID,
	att_description varchar(255),
	att_test_attack int,
	att_damage varchar(30),
	att_critical varchar(30),
	att_type_damage varchar(50),
	att_range varchar(30),
	att_character_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_att_id primary key(att_id)
);

alter table attack add constraint fk_attack_character foreign key(att_character_id) references character(cha_id);

create table ability_breed_origin (
	abo_id UUID,
	abo_description text,
	abo_character_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_abo_id primary key(abo_id)
);

alter table ability_breed_origin add constraint fk_ability_breed_origin_character foreign key(abo_character_id) references character(cha_id);

create table proficiency (
	pro_id UUID,
	pro_description varchar(255),
	pro_character_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_pro_id primary key(pro_id)
);

alter table proficiency add constraint fk_proficiency_character foreign key(pro_character_id) references character(cha_id);

create table defense (
	def_id UUID,
	def_total int,
	def_modifier int,
	def_armour_bonus int,
	def_others_bonus int,
	def_shield_bonus int,
	def_character_id UUID,
	created_at timestamp,
    updated_at timestamp,
	constraint pk_def_id primary key(def_id)
);

alter table defense add constraint fk_defense_character foreign key(def_character_id) references character(cha_id);













