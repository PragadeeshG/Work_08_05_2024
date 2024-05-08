create table if not exists subscription_chart(
subscription_code Integer not null,
gr_unit_effective Integer null,
gr_unit_effective_date varchar(255) null,
gr_unitsubscription_desc varchar(255) null,
gr_unitsubscription_short_desc varchar(255) null,
gr_unit_decimal_positions Integer null,
gr_unitsubscription_symbol varchar(255) null,
gr_unitsubscription_scale varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint subscription_chart_pk primary key(subscription_code));