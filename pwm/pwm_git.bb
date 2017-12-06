SUMMARY = "PWM release"
LICENSE = "CLOSED"

REBAR3_RELEASE_NAME = "0.1.0"


inherit rebar3

DEPENDS = "erlang erlang-tools"


SRC_URI = "git://git@github.com/Raphexion/pwm.git;protocol=ssh;branch=master"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

SRC_URI += "file://init"
SRC_URI += "file://config"
