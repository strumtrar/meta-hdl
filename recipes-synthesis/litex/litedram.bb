SUMMARY = "Small footprint and configurable DRAM core"
HOMEPAGE = "https://github.com/enjoy-digital/litedram"
SECTION = "devel/hdl"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f9889f63ba517bd604fde468a6b85bfd"

SRC_URI = "git://github.com/enjoy-digital/litedram;protocol=https;branch=master"
SRCREV = "6c8df7cc7be2f88e2d78d6282ada4213918de477"
PV = "0.2-dev+git${SRCPV}"

S = "${WORKDIR}/git"

inherit setuptools3

BBCLASSEXTEND = "native nativesdk"
