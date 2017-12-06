SUMMARY = "PWM release"
LICENSE = "CLOSED"

REBAR3_PROFILE = "default"
REBAR3_RELEASE_NAME = "pwm-0.1.0"

inherit rebar3

SRC_URI = "git://git@github.com/Raphexion/pwm.git;protocol=ssh;branch=master"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

SRC_URI += "file://init"
SRC_URI += "file://config"
